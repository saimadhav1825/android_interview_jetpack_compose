package com.example.android_interview_jetpack_compose.navigation.projectGraph

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun DetailScreen(navHostController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = "Detail Screen",
            modifier = Modifier.clickable {
                navHostController.navigate(route = HomeGraphNavigation.HomeScreen.route) {
                    popUpTo(HomeGraphNavigation.HomeScreen.route) {
                        inclusive = true
                    }
                }
            },
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenView() {
    DetailScreen(navHostController = rememberNavController())
}