package com.example.joseph.isitwednesday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = (ImageView)findViewById(R.id.myDay);
        img.setScaleType(ScaleType.FIT_XY);

        int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        if(dayOfWeek == 4){
            img.setImageResource(R.drawable.wednesday);
        }
        else {
            img.setImageResource(R.drawable.notwednesday);
        }
    }
}