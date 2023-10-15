package com.task.DBLogin.utils

import com.task.DBLogin.Database.UserDbViewModel
import com.task.DBLogin.MainActivity


class Utils {
    companion object {

        lateinit var activity: MainActivity
        var LoginObj: UserDbViewModel?=null
        const val username="username"
        const val usermail="usermail"
        val sharedhelper = Sharedhelper()

    }
}