package com.example.lr5_jo_android;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SQLHelper extends SQLiteOpenHelper {
    public SQLHelper(Context context){
        super(context, "TrainBase", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table " +
                "table1 (_id integer primary key autoincrement," +
                "fname text not null, lname text not null, Year integer not null," +
                " amountOfPoints integer not null);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion){
        db.execSQL("DROP TABLE IF EXISTS table1");
        onCreate(db);
    }

    public Cursor getFullTable(){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.query("table1", new String[]{"_id", "fname", "lname",
                        "Year", "amountOfPoints"}, null, null, null,
                null,null);


    }

    //insert some values for db
    public void insertSomeValue(String fname, String lname, int year, int amount){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("fName", fname);
        cv.put("lName", lname);
        cv.put("Year", year);
        cv.put("amountOfPoints", amount);

        db.insert("table1", null, cv);
    }

}
