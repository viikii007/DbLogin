package com.task.DBLogin.Database


class UserRepositoey(var daoobj: UserDao)
{
    fun InsertUser(user: UserTable) {
        daoobj.InsertUser(user)
    }

    fun GetUser(email:String):List<UserTable>
    {
        return daoobj.getUser(email)
    }

}
