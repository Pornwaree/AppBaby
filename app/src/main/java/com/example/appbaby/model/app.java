package com.example.appbaby.model;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "App")
public class app {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "category")
    public String category;

    @ColumnInfo(name = "district")
    public String district;

    @ColumnInfo(name = "image")
    public int imageRes;

    public app(int id, String category, String district, int imageRes) {
        this.id = id;
        this.category = category;
        this.district = district;
        this.imageRes = imageRes;
    }
}
