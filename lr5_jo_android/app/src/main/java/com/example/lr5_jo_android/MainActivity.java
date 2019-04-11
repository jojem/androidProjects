package com.example.lr5_jo_android;

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

        LinearLayout ll = (LinearLayout)findViewById(R.id.ll);
        LinearLayout row;
        ArrayList<Person> persons = getList();
        for (Person p: persons){
            row = new LinearLayout(this);
            row.setOrientation(LinearLayout.HORIZONTAL);

            TextView id = new TextView(this);
            id.setText(Integer.toString(p._id));
            id.setWidth(120);

            TextView name = new TextView(this);
            name.setText(p.name);
            name.setWidth(120);

            TextView Age = new TextView(this);
            name.setText(Integer.toString(p.Age));
            name.setWidth(120);

            row.addView(id);
            row.addView(name);
            row.addView(Age);

            ll.addView(row);
        }
    }

    public ArrayList<Person> getList(){
        ArrayList<Person> persons = new ArrayList<>();
        Cursor cursor = db.getFullTable();
        if(cursor != null){
            while(cursor.moveToNext()){
                persons.add(new Person(cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getInt(2)));
            }
        }
        return  persons;
    }
}
