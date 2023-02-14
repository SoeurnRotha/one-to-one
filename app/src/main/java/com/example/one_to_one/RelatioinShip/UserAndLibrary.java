package com.example.one_to_one.RelatioinShip;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.one_to_one.Model.Library;
import com.example.one_to_one.Model.User;

public class UserAndLibrary {

    @Embedded
    public User user;

    @Relation(
            parentColumn = "userid",
            entityColumn = "userowner"
    )
    public Library library;

    @Override
    public String toString() {
        return "UserAndLibrary{" +
                "user=" + user +
                ", library=" + library +
                '}';
    }
}
