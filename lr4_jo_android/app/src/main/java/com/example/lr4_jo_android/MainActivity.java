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
    }

    public  void onButtonClick(View v){
        Toast.makeText(MainActivity.this, "Button1 is pressed",
                Toast.LENGTH_SHORT).show();

        Button b1 = (Button)findViewById(R.id.b1);
        b1.setText("Pressed Button");
    }


}
