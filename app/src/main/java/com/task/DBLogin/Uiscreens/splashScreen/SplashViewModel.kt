package com.task.DBLogin.Uiscreens.splashScreen
import androidx.lifecycle.ViewModel
import com.task.DBLogin.navigation.AppNavigator
import com.task.DBLogin.navigation.DestinationClass
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject



@HiltViewModel
class SplashViewModel  @Inject constructor(private val appNavigator: AppNavigator) : ViewModel()
{

    fun onNavigatetoHomeScreen() {
        appNavigator.tryNavigateTo(DestinationClass.NewsFeed())
    }

    fun onNavigatetoLogin()
    {
        appNavigator.tryNavigateTo(DestinationClass.LoginSignup())
    }


}