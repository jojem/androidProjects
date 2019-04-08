package com.example.lr4_jo_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void onButtonClick(View v){
        Toast.makeText(MainActivity.this, "Pressed Button1",
                Toast.LENGTH_SHORT).show();

    }
}
