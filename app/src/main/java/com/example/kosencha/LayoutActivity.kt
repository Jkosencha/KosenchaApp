package com.example.kosencha

import android.graphics.Color
import android.inputmethodservice.Keyboard.Row
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.kosencha.ui.theme.KosenchaTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mytext()

        }
    }
}

@Composable
fun mytext(){
    Column(modifier = Modifier.background(color = Gray).fillMaxSize()) {
        Text(text = "Hello there", fontSize = 30.sp, color = Blue, fontStyle = FontStyle.Italic)
        Text(text = "Interesting", fontSize = 30.sp, color = Black, fontStyle = FontStyle.Italic)
        Text(text = "Intents", fontSize = 30.sp, color = Blue, fontStyle = FontStyle.Italic)
        Text(text = "Activity", fontSize = 30.sp, color = Black, fontStyle = FontStyle.Italic)

        Row(modifier = Modifier
            .background(color = DarkGray)
            .fillMaxSize()) {
            Text(text = "True", fontSize = 20.sp)
            Text(text = "False", fontSize = 20.sp)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun mytextpreview(){
    mytext()
}