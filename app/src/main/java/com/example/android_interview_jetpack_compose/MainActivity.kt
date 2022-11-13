package com.example.android_interview_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.android_interview_jetpack_compose.ui.theme.Android_interview_jetpack_composeTheme
import com.example.android_interview_jetpack_compose.utils.ExpandableCard
import com.example.android_interview_jetpack_compose.utils.TextFiledView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android_interview_jetpack_composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        TextSelectionView()
                    }

                }
            }
        }
    }
}



@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TextSelectionView() {
    Column {
        ExpandableCard(
            title = "My Title",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                    "sed do eiusmod tempor incididunt ut labore et dolore magna " +
                    "aliqua. Ut enim ad minim veniam, quis nostrud exercitation " +
                    "ullamco laboris nisi ut aliquip ex ea commodo consequat."
        )
        TextFiledView()
    }

}