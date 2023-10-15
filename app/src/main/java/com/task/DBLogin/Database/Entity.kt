package com.task.DBLogin.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserTable(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val username:String,
    val email:String,
    val password:String
)

