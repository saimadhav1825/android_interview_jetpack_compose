package com.example.android_interview_jetpack_compose.utils

import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
@Composable
fun TextFiledView() {
    var text by remember { mutableStateOf("Hello") }
    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Label") }
    )
}
