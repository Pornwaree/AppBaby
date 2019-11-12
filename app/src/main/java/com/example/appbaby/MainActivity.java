package com.example.appbaby;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;

import com.example.appbaby.adapter.RecyclerViewAdapter;
import com.example.appbaby.db.DatabaseHelper;
import com.example.appbaby.model.app;

import java.util.ArrayList;
import java.util.List;

import static com.example.appbaby.db.DatabaseHelper.COL_DESCRIPTION;
import static com.example.appbaby.db.DatabaseHelper.COL_ID;
import static com.example.appbaby.db.DatabaseHelper.COL_IMAGE;
import static com.example.appbaby.db.DatabaseHelper.COL_CATEGORY;
import static com.example.appbaby.db.DatabaseHelper.TABLE_App;

public class MainActivity extends AppCompatActivity {

    private List<app> mAppList = new ArrayList<>();
    private RecyclerViewAdapter mAdapter;

    private DatabaseHelper mDbHepler;
    private SQLiteDatabase mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button meanButton = findViewById(R.id.az_button);
        meanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AppDetailsActivity.class);
                intent.putExtra("type", 0);
                startActivity(intent);
            }
        });
    }
}


