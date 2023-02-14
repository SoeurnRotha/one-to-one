package com.example.one_to_one.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class Library {

    @PrimaryKey(autoGenerate = false)
    int libraryId;


    @ColumnInfo
    String lname;
    @ColumnInfo
    int userowner;


    public Library(int libraryId, String lname, int userowner) {
        this.libraryId = libraryId;
        this.lname = lname;
        this.userowner = userowner;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getUserowner() {
        return userowner;
    }

    public void setUserowner(int userowner) {
        this.userowner = userowner;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryId=" + libraryId +
                ", lname='" + lname + '\'' +
                ", userowner=" + userowner +
                '}';
    }
}
