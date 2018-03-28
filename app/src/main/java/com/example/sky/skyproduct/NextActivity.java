package com.example.sky.skyproduct;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;

/**
 * Created by sky on 2018/2/27.
 */

public class NextActivity extends AppCompatActivity {
    GridLayout gridLayout;
    String[] chars = new String[]{
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            ".","0","=","+"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        gridLayout = (GridLayout) findViewById(R.id.root);
        for (int i = 0 ; i < chars.length; i++){
            Button btn = new Button(this);
            btn.setText(chars[i]);
            btn.setTextSize(40);
            GridLayout.Spec rowSpec = GridLayout.spec(i/4+2,1f);
            GridLayout.Spec columnSpec = GridLayout.spec(i%4,1f);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec,columnSpec);

            params.setGravity(Gravity.FILL);
            gridLayout.addView(btn,params);
        }
    }
}
