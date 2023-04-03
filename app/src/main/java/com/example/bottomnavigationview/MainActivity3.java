package com.example.bottomnavigationview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

TextView tv_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv_num= findViewById(R.id.tv_num);

        Intent intent = getIntent();
        String str = intent.getStringExtra("strText");

        tv_num.setText(str);



    }
}