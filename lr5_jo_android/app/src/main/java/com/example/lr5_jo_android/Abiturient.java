package com.example.lr5_jo_android;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Abiturient {
    public int _id;
    public String fName;
    public String lName;
    public int Year;
    public int amountOfPoints;
    public Abiturient(int id, String fn, String ln,
                      int year, int amount){
        _id = id;
        fName = fn;
        lName = ln;
        Year = year;
        amountOfPoints = amount;
    }

}

