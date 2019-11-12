package com.example.appbaby.db;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.appbaby.R;

public class DatabaseHelper3 extends SQLiteOpenHelper {

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

    public DatabaseHelper3(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_App);

        ContentValues cv = new ContentValues();
        cv.put(COL_CATEGORY, "1");
        cv.put(COL_DESCRIPTION, "อักษร 1");
        cv.put(COL_IMAGE, R.drawable.bb1);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "2");
        cv.put(COL_DESCRIPTION, "เลข 2");
        cv.put(COL_IMAGE, R.drawable.bb2);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "3");
        cv.put(COL_DESCRIPTION, "เลข 3");
        cv.put(COL_IMAGE, R.drawable.bb3);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "4");
        cv.put(COL_DESCRIPTION, "เลข 4");
        cv.put(COL_IMAGE, R.drawable.bb4);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "5");
        cv.put(COL_DESCRIPTION, "เลข 5");
        cv.put(COL_IMAGE, R.drawable.bb5);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "6");
        cv.put(COL_DESCRIPTION, "เลข 6");
        cv.put(COL_IMAGE, R.drawable.bb6);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "7");
        cv.put(COL_DESCRIPTION, "เลข 7");
        cv.put(COL_IMAGE, R.drawable.bb7);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "8");
        cv.put(COL_DESCRIPTION, "เลข 8");
        cv.put(COL_IMAGE, R.drawable.bb8);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "9");
        cv.put(COL_DESCRIPTION, "เลข 9");
        cv.put(COL_IMAGE, R.drawable.bb9);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "10");
        cv.put(COL_DESCRIPTION, "เลข 10");
        cv.put(COL_IMAGE, R.drawable.bb10);
        db.insert(TABLE_App, null, cv);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
