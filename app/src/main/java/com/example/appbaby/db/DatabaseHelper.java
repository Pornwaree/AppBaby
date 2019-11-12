package com.example.appbaby.db;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.appbaby.R;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_App = "App";

    public static final String COL_ID = "_id";
    public static final String COL_CATEGORY = "category";
    public static final String COL_DESCRIPTION = "description";
    public static final String COL_IMAGE = "image";

    private static final String SQL_CREATE_App =
            "CREATE TABLE " + TABLE_App + " ("
                    + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + COL_CATEGORY + " TEXT, "
                    + COL_DESCRIPTION + " TEXT, "
                    + COL_IMAGE + " INTEGER )";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_App);

        ContentValues cv = new ContentValues();
        cv.put(COL_CATEGORY, "A");
        cv.put(COL_DESCRIPTION, "อักษร A");
        cv.put(COL_IMAGE, R.drawable.a);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "B");
        cv.put(COL_DESCRIPTION, "อักษร B");
        cv.put(COL_IMAGE, R.drawable.b);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "C");
        cv.put(COL_DESCRIPTION, "ตัวอักษร C");
        cv.put(COL_IMAGE, R.drawable.c);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "D");
        cv.put(COL_DESCRIPTION, "ตัวอักษร D");
        cv.put(COL_IMAGE, R.drawable.d);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "E");
        cv.put(COL_DESCRIPTION, "ตัวอักษร E");
        cv.put(COL_IMAGE, R.drawable.e);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "G");
        cv.put(COL_DESCRIPTION, "ตัวอักษร G");
        cv.put(COL_IMAGE, R.drawable.g);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "H");
        cv.put(COL_DESCRIPTION, "ตัวอักษร H");
        cv.put(COL_IMAGE, R.drawable.h);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "I");
        cv.put(COL_DESCRIPTION, "ตัวอักษร I");
        cv.put(COL_IMAGE, R.drawable.i);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "J");
        cv.put(COL_DESCRIPTION, "ตัวอักษร J");
        cv.put(COL_IMAGE, R.drawable.j);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "K");
        cv.put(COL_DESCRIPTION, "ตัวอักษร K");
        cv.put(COL_IMAGE, R.drawable.k);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "L");
        cv.put(COL_DESCRIPTION, "ตัวอักษร L");
        cv.put(COL_IMAGE, R.drawable.l);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "M");
        cv.put(COL_DESCRIPTION, "ตัวอักษร M");
        cv.put(COL_IMAGE, R.drawable.m);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "N");
        cv.put(COL_DESCRIPTION, "ตัวอักษร N");
        cv.put(COL_IMAGE, R.drawable.n);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "O");
        cv.put(COL_DESCRIPTION, "ตัวอักษร O");
        cv.put(COL_IMAGE, R.drawable.o);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "P");
        cv.put(COL_DESCRIPTION, "ตัวอักษร P");
        cv.put(COL_IMAGE, R.drawable.p);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "Q");
        cv.put(COL_DESCRIPTION, "ตัวอักษร Q");
        cv.put(COL_IMAGE, R.drawable.q);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "R");
        cv.put(COL_DESCRIPTION, "ตัวอักษร R");
        cv.put(COL_IMAGE, R.drawable.r);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "S");
        cv.put(COL_DESCRIPTION, "ตัวอักษร S");
        cv.put(COL_IMAGE, R.drawable.s);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "T");
        cv.put(COL_DESCRIPTION, "ตัวอักษร T");
        cv.put(COL_IMAGE, R.drawable.t);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "U");
        cv.put(COL_DESCRIPTION, "ตัวอักษร U");
        cv.put(COL_IMAGE, R.drawable.u);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "V");
        cv.put(COL_DESCRIPTION, "ตัวอักษร v");
        cv.put(COL_IMAGE, R.drawable.v);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "W");
        cv.put(COL_DESCRIPTION, "ตัวอักษร w");
        cv.put(COL_IMAGE, R.drawable.w);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "X");
        cv.put(COL_DESCRIPTION, "ตัวอักษร X");
        cv.put(COL_IMAGE, R.drawable.x);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "Y");
        cv.put(COL_DESCRIPTION, "ตัวอักษร Y");
        cv.put(COL_IMAGE, R.drawable.y);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "Z");
        cv.put(COL_DESCRIPTION, "ตัวอักษร Z");
        cv.put(COL_IMAGE, R.drawable.z);
        db.insert(TABLE_App, null, cv);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

