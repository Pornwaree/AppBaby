package com.example.appbaby.room_db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import com.example.appbaby.model.app;

@Dao
public interface AppDao {

    @Query("SELECT * FROM app")
    List<app> getAllApp();

    @Insert
    void insertApp(app app);
}
