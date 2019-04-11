package com.example.lr5_jo_android;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SQLHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new SQLHelper(this);


        db.insertSomeValue("Jamilya", "Chakhkieva", 1998, 239);


        LinearLayout ll = (LinearLayout)findViewById(R.id.ll);
        LinearLayout row;

        ArrayList<Abiturient> abiturients = getList();
        for (Abiturient p: abiturients){
            row = new LinearLayout(this);
            row.setOrientation(LinearLayout.HORIZONTAL);

            //here start information about abiturient
            TextView id = new TextView(this);
            id.setText(Integer.toString(p._id));
            id.setWidth(120);

            TextView fname = new TextView(this);
            fname.setText(p.fName);
            fname.setWidth(300);

            TextView lname = new TextView(this);
            lname.setText(p.lName);
            lname.setWidth(300);

            TextView Year = new TextView(this);
            Year.setText(Integer.toString(p.Year));
            Year.setWidth(120);

            TextView amountOfPoints = new TextView(this);
            amountOfPoints.setText(Integer.toString(p.amountOfPoints));
            amountOfPoints.setWidth(120);


            row.addView(id);
            row.addView(fname);
            row.addView(lname);
            row.addView(Year);
            row.addView(amountOfPoints);

            ll.addView(row);
        }

    }

    public ArrayList<Abiturient> getList(){
        ArrayList<Abiturient> abiturients = new ArrayList<>();
        Cursor cursor = db.getFullTable();
        if(cursor != null){
            while(cursor.moveToNext()){
                abiturients.add(new Abiturient(cursor.getInt(0),
                        cursor.getString(1), cursor.getString(2),
                        cursor.getInt(3),
                        cursor.getInt(4)));
            }
        }
        return  abiturients;
    }
}
