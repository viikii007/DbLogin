package com.task.DBLogin.Database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface UserDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun InsertUser(usertable: UserTable)

    @Query("SELECT * FROM UserTable where email=:email")
    fun getUser(email:String):List<UserTable>

}