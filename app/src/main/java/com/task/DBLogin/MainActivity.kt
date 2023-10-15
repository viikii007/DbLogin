package com.task.DBLogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.task.DBLogin.Database.UserDbViewModel
import com.task.DBLogin.navigation.SetNavigation
import com.task.DBLogin.ui.theme.DBLoginTheme
import com.task.DBLogin.utils.Utils.Companion.LoginObj
import com.task.DBLogin.utils.Utils.Companion.activity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DBLoginTheme {
                activity=this
                 Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginObj= ViewModelProvider(this)[UserDbViewModel::class.java]
                    SetNavigation()
                 }
            }
        }
    }
}
