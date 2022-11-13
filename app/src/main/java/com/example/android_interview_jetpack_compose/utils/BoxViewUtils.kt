package com.example.android_interview_jetpack_compose.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//Box can use like framelayout
@Composable
fun BoxView() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
        ) {
            Box(
                Modifier
                    .width(100.dp)
                    .height(50.dp)
                    .background(Color.Gray)
            ) {

            }
            Text(text = "This Is Android", fontSize = 40.sp)
        }
    }
}