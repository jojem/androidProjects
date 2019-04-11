package com.example.lr5_jo_android;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Person {
    public int _id;
    public String name;
    public int Age;
    public Person(int id, String n, int a){
        _id = id;
        name = n;
        Age = a;
    }

}

