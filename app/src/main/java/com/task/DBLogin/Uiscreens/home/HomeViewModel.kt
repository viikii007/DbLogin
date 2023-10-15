package com.task.DBLogin.Uiscreens.home

import androidx.lifecycle.ViewModel

import com.task.DBLogin.navigation.AppNavigator
import com.task.DBLogin.navigation.DestinationClass
import com.task.DBLogin.utils.Utils
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val appNavigator: AppNavigator) : ViewModel() {

    fun onNavigatetoLogin()
    {
        appNavigator.tryNavigateTo(DestinationClass.LoginSignup())
    }
    fun onBackPress()
    {
        Utils.activity.finishAffinity()
        Utils.activity.finish()
    }

}