package com.task.DBLogin.Database

import android.app.Application
import androidx.lifecycle.AndroidViewModel


class UserDbViewModel(application: Application): AndroidViewModel(application) {
    private var repobj: UserRepositoey

    init {
        val context = AppDatabase.getInstance(application).User_dao()
        repobj = UserRepositoey(context)
    }

    fun InsertUser(user: UserTable) {
        repobj.InsertUser(user)
    }

    fun GetUser(email:String):List<UserTable>
    {
        return repobj.GetUser(email)
    }

}