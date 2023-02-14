package com.example.one_to_one;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import com.example.one_to_one.Dao.MyDao;
import com.example.one_to_one.Database.MyDatabase;
import com.example.one_to_one.Model.Library;
import com.example.one_to_one.Model.User;
import com.example.one_to_one.RelatioinShip.UserAndLibrary;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    MyDatabase myDatabase ;
    private final static String TAG = "Select Success";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        MyDatabase.getInstance(getApplicationContext()).getdao().addUser(new User(1,"GEGE"));


        MyDatabase.getInstance(this).getdao().addUser(new User(20,"Coca cola"));
        MyDatabase.getInstance(this).getdao().addUser(new User(30,"Banana"));
        MyDatabase.getInstance(this).getdao().addUser(new User(40,"Laptop"));



//
        MyDatabase.getInstance(this).getdao().insertLibrary(new Library(10,"My Coca",20));
        MyDatabase.getInstance(this).getdao().insertLibrary(new Library(11,"ABC",20));
        MyDatabase.getInstance(this).getdao().insertLibrary(new Library(12,"Book",20));

        List<UserAndLibrary> userAndLibraries = MyDatabase.getInstance(getApplicationContext()).getdao().getUserAndLibrary();

        Log.d(TAG, "onCreate: "+userAndLibraries.toString());


    }
}