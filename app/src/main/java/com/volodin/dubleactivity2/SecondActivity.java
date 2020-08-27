package com.volodin.dubleactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements Constants {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String txt = getIntent().getStringExtra(T);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(txt);



    }
}