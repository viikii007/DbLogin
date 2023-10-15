package com.task.DBLogin.utils

import android.content.Context
import android.content.SharedPreferences



class Sharedhelper {
    var sharedPreferences: SharedPreferences? = null
    var editor: SharedPreferences.Editor? = null

    fun putString(context: Context, Key: String?, Value: String?) {
        try {
            sharedPreferences = context.getSharedPreferences("Cache", Context.MODE_PRIVATE)
            editor = sharedPreferences!!.edit()
            editor?.putString(Key, Value)
            editor?.commit()
        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    fun getString(contextGetKey: Context, Key: String?): String? {
        sharedPreferences = contextGetKey.getSharedPreferences("Cache", Context.MODE_PRIVATE)
        return sharedPreferences!!.getString(Key, "")
    }

}