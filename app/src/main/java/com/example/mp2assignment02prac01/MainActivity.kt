package com.example.mp2assignment02prac01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mp2assignment02prac01.ui.theme.MP2Assignment02Prac01Theme


class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MP2Assignment02Prac01Theme {

                navController= rememberNavController()
                SetupNavGraph(navController = navController)

            }
        }
    }
}


