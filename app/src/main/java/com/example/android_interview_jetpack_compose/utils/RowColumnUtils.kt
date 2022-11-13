package com.example.android_interview_jetpack_compose.utils

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.android_interview_jetpack_compose.ui.theme.Android_interview_jetpack_composeTheme

@Composable
fun ColumnScope.ShowColumn(weight: Float, colors: Color = MaterialTheme.colors.primary) {
    Surface(
        modifier = Modifier
            .height(100.dp)
            .width(100.dp)
            .weight(weight = weight),
        color = colors
    ) {

    }
}

@Composable
fun RowScope.ShowRow(weight: Float, colors: Color = MaterialTheme.colors.primary) {
    Surface(
        modifier = Modifier
            .height(100.dp)
            .width(100.dp)
            .weight(weight = weight),
        color = colors
    ) {

    }
}


@Composable
fun ColumnView() {
    Android_interview_jetpack_composeTheme {
        Column(
            Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            ShowColumn(weight = 1f, MaterialTheme.colors.secondary)
            ShowColumn(weight = 1f)
            ShowColumn(weight = 1f, MaterialTheme.colors.surface)
            ShowColumn(weight = 1f)
        }
    }
}

@Composable
fun RowView() {
    Android_interview_jetpack_composeTheme {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            /*  ShowRow(weight = 1f, MaterialTheme.colors.primaryVariant)
              ShowRow(weight = 3f, MaterialTheme.colors.primary)*/
            BoxView()
        }
    }
}