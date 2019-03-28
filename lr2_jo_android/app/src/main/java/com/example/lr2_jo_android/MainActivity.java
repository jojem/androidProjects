package com.example.lr2_jo_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewRing;
    ImageView imageViewOval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("TestAppName");


        imageViewRing=(ImageView)findViewById(R.id.imageViewRing);
        imageViewOval=(ImageView)findViewById(R.id.imageViewOval);
        setDrawable();
    }

    private void setDrawable() {

        imageViewRing.setImageResource(R.drawable.ring);
        imageViewOval.setImageResource(R.drawable.oval);
    }

}
