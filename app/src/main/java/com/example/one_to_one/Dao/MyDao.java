package com.example.one_to_one.Dao;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.one_to_one.Model.Library;
import com.example.one_to_one.Model.User;
import com.example.one_to_one.RelatioinShip.UserAndLibrary;

import java.util.List;

@Dao
public interface MyDao {


    @Insert
    void addUser(User user);

    @Insert
    void insertLibrary(Library library);

    @Query("DELETE FROM User")
    void deleteUser();


    @Query("DELETE FROM Library")
    void deleteLibrary();


    @Query("SELECT * FROM User")
    List<User> getUser();


    @Query("SELECT * FROM Library")
    List<Library> getLibrary();


    @Transaction
    @Query("SELECT * FROM User")
    List<UserAndLibrary> getUserAndLibrary();



}
