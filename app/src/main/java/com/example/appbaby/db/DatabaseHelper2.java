package com.example.appbaby.db;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.appbaby.R;

public class DatabaseHelper2 extends SQLiteOpenHelper {

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

    public DatabaseHelper2(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_App);

        ContentValues cv = new ContentValues();
        cv.put(COL_CATEGORY, "ก");
        cv.put(COL_DESCRIPTION, "อักษร ก");
        cv.put(COL_IMAGE, R.drawable.aa1);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ข");
        cv.put(COL_DESCRIPTION, "อักษร ข");
        cv.put(COL_IMAGE, R.drawable.aa2);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ฃ");
        cv.put(COL_DESCRIPTION, "อักษร ฃ");
        cv.put(COL_IMAGE, R.drawable.aa3);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ค");
        cv.put(COL_DESCRIPTION, "อักษร ค");
        cv.put(COL_IMAGE, R.drawable.aa4);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ฅ");
        cv.put(COL_DESCRIPTION, "อักษร ฅ");
        cv.put(COL_IMAGE, R.drawable.aa5);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ฆ");
        cv.put(COL_DESCRIPTION, "อักษร ฆ");
        cv.put(COL_IMAGE, R.drawable.aa6);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ง");
        cv.put(COL_DESCRIPTION, "อักษร ง");
        cv.put(COL_IMAGE, R.drawable.aa7);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "จ");
        cv.put(COL_DESCRIPTION, "อักษร จ");
        cv.put(COL_IMAGE, R.drawable.aa8);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ฉ");
        cv.put(COL_DESCRIPTION, "อักษร ฉ");
        cv.put(COL_IMAGE, R.drawable.aa9);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ช");
        cv.put(COL_DESCRIPTION, "อักษร ช");
        cv.put(COL_IMAGE, R.drawable.aa10);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ซ");
        cv.put(COL_DESCRIPTION, "อักษร ซ");
        cv.put(COL_IMAGE, R.drawable.aa11);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ฌ");
        cv.put(COL_DESCRIPTION, "อักษร ฌ");
        cv.put(COL_IMAGE, R.drawable.aa12);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ญ");
        cv.put(COL_DESCRIPTION, "อักษร ญ");
        cv.put(COL_IMAGE, R.drawable.aa13);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ฎ");
        cv.put(COL_DESCRIPTION, "อักษร ฎ");
        cv.put(COL_IMAGE, R.drawable.aa14);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ฏ");
        cv.put(COL_DESCRIPTION, "อักษร ฏ");
        cv.put(COL_IMAGE, R.drawable.aa15);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ฐ");
        cv.put(COL_DESCRIPTION, "อักษร ฐ");
        cv.put(COL_IMAGE, R.drawable.aa16);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ฑ");
        cv.put(COL_DESCRIPTION, "อักษร ฑ");
        cv.put(COL_IMAGE, R.drawable.aa17);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ฒ");
        cv.put(COL_DESCRIPTION, "อักษร ฒ");
        cv.put(COL_IMAGE, R.drawable.aa18);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ณ");
        cv.put(COL_DESCRIPTION, "อักษร ณ");
        cv.put(COL_IMAGE, R.drawable.aa19);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ด");
        cv.put(COL_DESCRIPTION, "อักษร ด");
        cv.put(COL_IMAGE, R.drawable.aa20);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ต");
        cv.put(COL_DESCRIPTION, "อักษร ต");
        cv.put(COL_IMAGE, R.drawable.aa21);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ถ");
        cv.put(COL_DESCRIPTION, "อักษร ถ");
        cv.put(COL_IMAGE, R.drawable.aa22);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ท");
        cv.put(COL_DESCRIPTION, "อักษร ท");
        cv.put(COL_IMAGE, R.drawable.aa23);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ธ");
        cv.put(COL_DESCRIPTION, "อักษร ธ");
        cv.put(COL_IMAGE, R.drawable.aa24);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "น");
        cv.put(COL_DESCRIPTION, "อักษร น");
        cv.put(COL_IMAGE, R.drawable.aa25);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "บ");
        cv.put(COL_DESCRIPTION, "อักษร บ");
        cv.put(COL_IMAGE, R.drawable.aa26);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ป");
        cv.put(COL_DESCRIPTION, "อักษร ป");
        cv.put(COL_IMAGE, R.drawable.aa27);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ผ");
        cv.put(COL_DESCRIPTION, "อักษร ผ");
        cv.put(COL_IMAGE, R.drawable.aa28);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ฝ");
        cv.put(COL_DESCRIPTION, "อักษร ฝ");
        cv.put(COL_IMAGE, R.drawable.aa29);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "พ");
        cv.put(COL_DESCRIPTION, "อักษร พ");
        cv.put(COL_IMAGE, R.drawable.aa30);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ฟ");
        cv.put(COL_DESCRIPTION, "อักษร ฟ");
        cv.put(COL_IMAGE, R.drawable.aa31);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ภ");
        cv.put(COL_DESCRIPTION, "อักษร ภ");
        cv.put(COL_IMAGE, R.drawable.aa32);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ม");
        cv.put(COL_DESCRIPTION, "อักษร ม");
        cv.put(COL_IMAGE, R.drawable.aa33);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ย");
        cv.put(COL_DESCRIPTION, "อักษร ย");
        cv.put(COL_IMAGE, R.drawable.aa34);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ร");
        cv.put(COL_DESCRIPTION, "อักษร ร");
        cv.put(COL_IMAGE, R.drawable.aa35);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ล");
        cv.put(COL_DESCRIPTION, "อักษร ล");
        cv.put(COL_IMAGE, R.drawable.aa36);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ว");
        cv.put(COL_DESCRIPTION, "อักษร ว");
        cv.put(COL_IMAGE, R.drawable.aa37);
        db.insert(TABLE_App, null, cv);



        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ศ");
        cv.put(COL_DESCRIPTION, "อักษร ศ");
        cv.put(COL_IMAGE, R.drawable.aa38);
        db.insert(TABLE_App, null, cv);


        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ษ");
        cv.put(COL_DESCRIPTION, "อักษร ษ");
        cv.put(COL_IMAGE, R.drawable.aa39);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ส");
        cv.put(COL_DESCRIPTION, "อักษร ส");
        cv.put(COL_IMAGE, R.drawable.aa40);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ห");
        cv.put(COL_DESCRIPTION, "อักษร ห");
        cv.put(COL_IMAGE, R.drawable.aa41);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ฬ");
        cv.put(COL_DESCRIPTION, "อักษร ฬ");
        cv.put(COL_IMAGE, R.drawable.aa42);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "อ");
        cv.put(COL_DESCRIPTION, "อักษร อ");
        cv.put(COL_IMAGE, R.drawable.aa43);
        db.insert(TABLE_App, null, cv);

        cv = new ContentValues();
        cv.put(COL_CATEGORY, "ฮ");
        cv.put(COL_DESCRIPTION, "อักษร ฮ");
        cv.put(COL_IMAGE, R.drawable.aa44);
        db.insert(TABLE_App, null, cv);








    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
