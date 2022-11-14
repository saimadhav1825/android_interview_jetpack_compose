package com.example.android_interview_jetpack_compose.navigation.projectGraph

sealed class HomeGraphNavigation(val route: String) {
    object HomeScreen : HomeGraphNavigation(route = "home_screen")
    object DetailScreen : HomeGraphNavigation(route = "detail_screen")
}