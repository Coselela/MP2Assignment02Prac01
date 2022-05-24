package com.example.mp2assignment02prac01

sealed class Screen (val route:String){
    object Home:Screen(route= "WelcomeScreen")
    object Details:Screen(route= "MyDetails")
    object Modules:Screen(route="CurrentModules")
}
