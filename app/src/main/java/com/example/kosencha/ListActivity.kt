package com.example.kosencha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mynumbers()
        }
    }
}

@Composable
fun mynumbers(){
    var scrollState= rememberScrollState()
    Column(modifier = Modifier.fillMaxSize().background(color = Color.LightGray).verticalScroll(scrollState)) {
        for(item in 1 ..5000)
            Text(text = "Item is $item",
                fontStyle = FontStyle.Italic,
                fontSize = 20.sp,
                modifier = Modifier.fillMaxWidth(),
                color = Color.Blue)


    }
}

@Preview(showBackground = true)
@Composable
fun mynumbersPreview(){
    mynumbers()
}