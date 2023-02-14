package com.example.one_to_one.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.one_to_one.Dao.MyDao;
import com.example.one_to_one.Model.Library;
import com.example.one_to_one.Model.User;


@Database(entities = {User.class, Library.class}, version = 1)
public abstract class MyDatabase extends RoomDatabase {


    public abstract MyDao getdao();


    private static volatile MyDatabase INSTANCE;

    public static MyDatabase getInstance(Context context) {

        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), MyDatabase.class, "UserAndLibrary")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }
}
