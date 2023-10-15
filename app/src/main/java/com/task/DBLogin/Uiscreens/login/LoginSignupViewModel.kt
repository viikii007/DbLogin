package com.task.DBLogin.Uiscreens.login

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.task.DBLogin.navigation.AppNavigator
import com.task.DBLogin.navigation.DestinationClass
import com.task.DBLogin.utils.Utils
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class LoginSignupViewModel  @Inject constructor (private val  appNavigator: AppNavigator) : ViewModel()
{

    fun onNavigatetoHome()
    {
        appNavigator.tryNavigateTo(DestinationClass.NewsFeed())
    }

    val selected_item= mutableStateOf(1)

    fun onBackPress()
    {
        Utils.activity.finishAffinity()
        Utils.activity.finish()
    }

}