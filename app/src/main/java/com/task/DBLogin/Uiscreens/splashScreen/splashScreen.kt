package com.task.DBLogin.Uiscreens.splashScreen
 import android.annotation.SuppressLint
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
 import androidx.compose.foundation.layout.size
 import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
 import androidx.compose.ui.draw.scale
 import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
 import androidx.compose.ui.layout.ContentScale
 import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
 import androidx.compose.ui.unit.dp
 import androidx.hilt.navigation.compose.hiltViewModel
import com.task.DBLogin.R
import com.task.DBLogin.utils.Utils
import kotlinx.coroutines.delay

@SuppressLint("SuspiciousIndentation")
@Composable
fun AnimatedSplashScreen(viewmodel: SplashViewModel = hiltViewModel()) {
    val context = LocalContext.current

    val isLoggedin = Utils.sharedhelper.getString(context, Utils.usermail).toString()

    var startAnimation by remember { mutableStateOf(false) }
    val alphaAnim = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = tween(durationMillis = 3000), label = ""
    )

    val scaleAnim = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0.5f,
        animationSpec = tween(durationMillis = 3000), label = ""
    )

    LaunchedEffect(key1 = true) {
        startAnimation = true
        delay(3000)

        if (isLoggedin.isEmpty()) {
            viewmodel.onNavigatetoLogin()
        } else {
            viewmodel.onNavigatetoHomeScreen()
        }
    }

    Splash(alpha = alphaAnim.value, scale = scaleAnim.value)
}

@Composable
fun Splash(alpha: Float, scale: Float) {
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "splashIcon",
            modifier = Modifier
                .alpha(alpha = alpha).size(300.dp)
                .scale(scale = scale),
            colorFilter = ColorFilter.tint(Color.Green),
            contentScale = ContentScale.FillBounds
        )
    }
}
