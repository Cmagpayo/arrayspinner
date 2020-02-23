package com.example.elements;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    static String[] sList = new String[100];
    static int ctr;
    EditText e;TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e = findViewById(R.id.etxtName);
        t = findViewById(R.id.txtDisplay);
    }
    public void Add(View v){
        if(sList[0]==""||sList[0]==null){
            sList[0] = e.getText().toString();
            ctr++;
        }
        else
        {
            sList[ctr]= e.getText().toString();
            ctr++;
        }
        t.setText(e.getText().toString());
    }

    public void Next(View v){
        Intent i = new Intent(this, Display.class);
        startActivity(i);
    }
}
