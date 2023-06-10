package com.example.kosencha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.kosencha.ui.theme.KosenchaTheme

class PizzaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           pizza()
        }
    }
}

@Composable
fun pizza() {
    Column(modifier = Modifier.background(color = Color.Black).fillMaxSize()) {

        Text(text = "Themes", fontSize = 20.sp, color = Color.White)
        Image(painter = painterResource(id = R.drawable.pizza), contentDescription = "Image")
        Text(text = "Homemade veg Pizza", fontSize = 30.sp, color = Color.Magenta)
        Text(text = "Pizza, dish of Italian origin consisting of flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other ingridients, baked quickly - usually", color = Color.White, fontSize = 20.sp)
    }
}
@Preview(showBackground = true)
@Composable
fun PizzaPreview(){
    pizza()
}
