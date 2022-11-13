package com.example.android_interview_jetpack_compose.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType


@OptIn(ExperimentalUnitApi::class)
@Composable
fun TextViewShow() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(verticalArrangement = Arrangement.Center) {
            TextviewMethod()
            Text(
                buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Cyan, fontSize = TextUnit(
                                30f,
                                TextUnitType.Sp
                            )
                        )
                    ) {
                        append("A")
                    }
                    withStyle(
                        style = SpanStyle(
                            color = Color.Black,
                            baselineShift = BaselineShift.Subscript
                        )
                    ) {
                        append("A")
                    }
                    withStyle(
                        style = SpanStyle(
                            color = Color.Black,
                            baselineShift = BaselineShift.Superscript
                        )
                    ) {
                        append("A")
                    }
                    append("A")
                    append("A")
                },
                fontSize = TextUnit(20f, TextUnitType.Sp),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Gray), textAlign = TextAlign.Center
            )
        }
    }
}

@OptIn(ExperimentalUnitApi::class)
@Composable
fun TextviewMethod() {
    Surface(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Hello World",
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            fontStyle = FontStyle.Italic,
            letterSpacing = TextUnit(5f, TextUnitType.Sp),
            overflow = TextOverflow.Visible,
            color = Color.Blue,
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            maxLines = 2, modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green),
            lineHeight = TextUnit(1f, TextUnitType.Em)
        )
    }
}

@Composable
fun TextSelectionMethod() {
    SelectionContainer {
        Column {
            Text(text = "Hello World")
            DisableSelection {
                Text(text = "Hello World")
            }
            Text(text = "Hello World")
        }
    }
}