package com.example.android_interview_jetpack_compose.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import coil.transform.BlurTransformation
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import com.example.android_interview_jetpack_compose.R

@ExperimentalCoilApi
@Composable
fun CoilImage() {
    Box(
        modifier = Modifier
            .height(150.dp)
            .width(150.dp),
        contentAlignment = Alignment.Center
    )
    {
        val painter = rememberImagePainter(
            data = "https://avatars.githubusercontent.com/u/149940367v=4",
            builder = {
                placeholder(R.drawable.ic_launcher_background)
                error(R.drawable.ic_launcher_foreground)
                crossfade(1000)
                transformations(
                    GrayscaleTransformation(),
                    BlurTransformation(LocalContext.current),
                    CircleCropTransformation()
                )
            }
        )
        val painterState = painter.state
        Image(painter = painter, contentDescription = "Logo")
        if (painterState is ImagePainter.State.Loading)
            CircularProgressIndicator()
    }

}
