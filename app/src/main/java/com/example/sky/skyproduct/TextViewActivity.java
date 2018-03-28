package com.example.sky.skyproduct;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by sky on 2018/2/28.
 */

public class TextViewActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CalendarView cv;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_bar);
        cv = (CalendarView)findViewById(R.id.calendarView);
        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                int month =i1+1;
                Toast.makeText(TextViewActivity.this,"你的生日是"+i+"年"+i1+"月"+i2+"日",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn:{
                Log.d("12345","单号哈");
                RadioGroup gp = (RadioGroup) findViewById(R.id.rg);
                String tip = gp.getCheckedRadioButtonId() == R.id.man ? "男":"女";
                Toast.makeText(TextViewActivity.this,tip,Toast.LENGTH_LONG).show();
            }break;
        }
    }
}
