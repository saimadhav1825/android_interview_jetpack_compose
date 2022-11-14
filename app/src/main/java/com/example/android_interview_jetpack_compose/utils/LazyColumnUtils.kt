package com.example.android_interview_jetpack_compose.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun LazyColumnView() {
    Surface(modifier = Modifier.fillMaxSize()) {
        val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        LazyColumn(
            contentPadding = PaddingValues(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(items = list) { item ->
                Text(
                    text = "Item At $item",
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.DarkGray)
                        .padding(10.dp),
                    textAlign = TextAlign.Center, color = Color.White
                )
            }
        }
    }
}