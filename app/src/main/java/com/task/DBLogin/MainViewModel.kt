package com.task.DBLogin

import androidx.lifecycle.ViewModel
import com.task.DBLogin.navigation.AppNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel  @Inject constructor (appNavigator: AppNavigator) : ViewModel()
{
    val navigationChannel = appNavigator.navigationChannel
}