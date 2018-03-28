package com.example.sky.skyproduct;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        setContentView(layout);
        layout.setOrientation(LinearLayout.VERTICAL);

        final TextView tv = new TextView(this);
//        tv.setText("头部");

        Button btn =  new Button(this);
        btn.setText(R.string.OK);
        btn.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        layout.addView(tv);
        layout.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            private int temp;
            @Override
            public void onClick(View view) {
                temp++;
                tv.setText("Hello, Android" + temp);
            }
        });
//        setContentView(R.layout.activity_main);
    }
//    @Override
//    public  boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.layout.activity_main,menu);
//    }
//    public void clickHandler(View source){
//        TextView tv = (TextView)findViewById(R.id.show);
//        tv.setText("Hello Android-" + new java.util.Date());
//    }
}
