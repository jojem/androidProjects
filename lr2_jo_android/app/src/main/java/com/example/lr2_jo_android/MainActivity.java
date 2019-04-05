package com.example.lr2_jo_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imagePhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Jo's App");


        imagePhone=(ImageView)findViewById(R.id.imagePhone);
        setDrawable();
    }

    private void setDrawable() {
        imagePhone.setImageResource(R.drawable.shape);
    }

}
