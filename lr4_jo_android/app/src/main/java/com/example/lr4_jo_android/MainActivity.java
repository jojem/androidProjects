package com.example.lr4_jo_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(click1);
        Button b2 = (Button)findViewById(R.id.b2);
        b2.setOnClickListener(click1);
        Button b3 = (Button)findViewById(R.id.b3);
        b3.setOnClickListener(click1);
    }

    public  void onButtonClick(View v){
        Button b1 = (Button)findViewById(R.id.b1);
        Button b2 = (Button)findViewById(R.id.b2);
        Button b3 = (Button)findViewById(R.id.b3);
        b1.setText("Button1");
        b2.setText("Button2");
        b3.setText("Button3");
    }

    public void someClickForButton(View v){
        ((Button)v).setText("Pressed");
    }

    View.OnClickListener click1 = new View.OnClickListener() {
      @Override
      public void onClick(View v){
          onButtonClick(v);
          ((Button)v).setText("Jamilya");
          Toast.makeText(MainActivity.this, "Button is pressed",
                  Toast.LENGTH_LONG).show();
      }
    };




}
