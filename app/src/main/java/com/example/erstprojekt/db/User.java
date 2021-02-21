package com.example.erstprojekt.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    public int uid;

     @ColumnInfo(name = "first_name")
    public String firstName;

     @ColumnInfo(name = "last_name")
    public String lastName;

     @ColumnInfo(name = "skill_set")
    public String skillSet;

}
