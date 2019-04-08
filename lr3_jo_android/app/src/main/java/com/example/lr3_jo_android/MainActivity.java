package com.example.lr3_jo_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridLayout gr = (GridLayout)findViewById(R.id.grid);

        Button b1= new Button(this);
        Button b2= new Button(this);
        Button b3= new Button(this);
        Button b4= new Button(this);
        Button b5= new Button(this);

        b1.setText("1");
        b2.setText("2");
        b3.setText("3");
        b4.setText("4");
        b5.setText("5");
        gr.addView(b1);
        gr.addView(b2);
        gr.addView(b3);
        gr.addView(b4);
        gr.addView(b5);
        gr.setRowCount(3);
        gr.setColumnCount(3);

    }
}
