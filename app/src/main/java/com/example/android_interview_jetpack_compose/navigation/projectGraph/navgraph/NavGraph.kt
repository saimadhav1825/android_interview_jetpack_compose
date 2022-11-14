package com.example.android_interview_jetpack_compose.navigation.projectGraph.navgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.android_interview_jetpack_compose.navigation.HomeScreen
import com.example.android_interview_jetpack_compose.navigation.projectGraph.DetailScreen
import com.example.android_interview_jetpack_compose.navigation.projectGraph.HomeGraphNavigation

@Composable
fun SetUpNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = HomeGraphNavigation.HomeScreen.route
    ) {
        composable(HomeGraphNavigation.HomeScreen.route) {
            HomeScreen(navController)
        }

        composable(HomeGraphNavigation.DetailScreen.route) {
            DetailScreen(navController)
        }
    }
}