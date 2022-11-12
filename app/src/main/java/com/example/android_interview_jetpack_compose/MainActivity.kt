package com.example.android_interview_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_interview_jetpack_compose.ui.theme.Android_interview_jetpack_composeTheme

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
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

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

@Preview(showBackground = true)
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

//Box can use like framelayout
@Composable
fun BoxView() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        Box(modifier = Modifier.fillMaxWidth()
            .background(Color.Green)) {
            Box(Modifier.width(100.dp).height(50.dp).background(Color.Gray)) {
                
            }
            Text(text = "This Is Android", fontSize = 40.sp)
        }
    }
}