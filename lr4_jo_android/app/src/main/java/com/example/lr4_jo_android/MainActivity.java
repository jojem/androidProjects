package com.example.lr4_jo_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  void onButtonClick(View v){
        Toast.makeText(MainActivity.this, "Button1 is pressed",
                Toast.LENGTH_SHORT).show();

        Button b1 = (Button)findViewById(R.id.b1);
        TextView tx1 = (TextView)findViewById(R.id.text_hello);
        b1.setText("Chakhkieva");
        Button b2 = (Button)findViewById(R.id.b2);
        b2.setText("Show My First Name");
    }

    public void someClickForButton(View v){
        Toast.makeText(MainActivity.this, "Button2 is pressed",
                Toast.LENGTH_SHORT).show();

        ((Button)v).setText("Jamilya");
        TextView tx1 = (TextView)findViewById(R.id.text_hello);
        Button b1 = (Button)findViewById(R.id.b1);
        b1.setText("Show My Last Name");
    }




}
