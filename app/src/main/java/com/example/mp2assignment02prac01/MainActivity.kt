package com.example.mp2assignment02prac01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mp2assignment02prac01.ui.theme.MP2Assignment02Prac01Theme

object NavRoute{
    val WelcomeScreen = "WelcomeScreen"
    val MyDetails = "DetailsScreen"
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MP2Assignment02Prac01Theme {

                val navController = rememberNavController()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyNavHost(navHostController = navController)
                }
            }
        }
    }
}


@Composable
fun MyNavHost(navHostController: NavHostController){
    NavHost(
        navController = navHostController,
        startDestination = NavRoute.WelcomeScreen
    ){
        composable(NavRoute.WelcomeScreen){
            WelcomeScreen{
                navHostController.navigate(NavRoute.MyDetails)
            }
        }

        composable(NavRoute.MyDetails){
            MyDetails{
                navHostController.navigate(NavRoute.WelcomeScreen)
            }
        }
    }
}


