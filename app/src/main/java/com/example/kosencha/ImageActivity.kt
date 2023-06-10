package com.example.kosencha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            image()


        }
    }
}

@Composable
fun image(){
    Column(modifier = Modifier.fillMaxSize()) {

       Text(text = "image", fontSize = 40.sp)
       Image(painter = painterResource(id = R.drawable.image2), contentDescription = "Image" )

       Row() {
         Text(text = "tech", fontSize = 40.sp)
         Image(painter = painterResource(id = R.drawable.image2), contentDescription = "Imagetech" )
    }
}
}
@Preview(showBackground = true)
@Composable
fun ImagePreview(){
    image()
}