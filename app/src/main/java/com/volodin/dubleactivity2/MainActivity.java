package com.volodin.dubleactivity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Constants {

    AutoCompleteTextView autoCompleteCatName;
    TextView textView;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        autoCompleteCatName = (AutoCompleteTextView)findViewById(R.id.autoCompleteCatName);
        textView =(TextView)findViewById(R.id.textView);

        String[] cats = getResources().getStringArray(R.array.autoCompleteCatName);
        List<String> catList = Arrays.asList(cats);
        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, catList);
        autoCompleteCatName.setAdapter(adapter);


        //Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();




    }




    public void Send(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(T, autoCompleteCatName.getText().toString());
        startActivity(intent);
    }
}