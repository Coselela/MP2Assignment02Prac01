package com.example.mp2assignment02prac01

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(navController: NavHostController){

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route)

    {
        composable(
            route= Screen.Home.route
        ){
            WelcomeScreen(navController=navController)
        }
        composable(
            route= Screen.Details.route
        ){
            MyDetails(navController=navController)
        }
        composable(
            route= Screen.Modules.route
        ){
            CurrentModules(navController=navController)
        }
    }
}