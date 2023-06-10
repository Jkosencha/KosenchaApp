package com.example.kosencha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kosencha.ui.theme.KosenchaTheme

class MultiActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            multicards()
        }
    }
}

@Composable
fun multicards(){
    var scrollState = rememberScrollState()


    Column(modifier = Modifier
        .fillMaxSize()){

    Text(text = "DUBAI, MEDIA CITY", fontWeight = FontWeight.Bold, fontSize = 20.sp)
    Row(modifier = Modifier
        .horizontalScroll(scrollState)
        .padding(20.dp)) {

        Card() {
                Image(painter = painterResource(id = R.drawable.image9),
                    contentDescription = "cartoon3",
                    modifier = Modifier
                        .size(100.dp)
                        .clip(shape = RectangleShape))

        }
        Spacer(modifier = Modifier.size(20.dp))
        Card() {
            Image(painter = painterResource(id = R.drawable.image10),
                contentDescription = "cartoon3",
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = RectangleShape))

        }
        Spacer(modifier = Modifier.size(20.dp))
        Card() {
            Image(painter = painterResource(id = R.drawable.image6),
                contentDescription = "cartoon3",
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = RectangleShape))

        }

        Spacer(modifier = Modifier.size(20.dp))
        Card() {
            Image(painter = painterResource(id = R.drawable.image6),
                contentDescription = "cartoon3",
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = RectangleShape))

        }
    }

    Text(text = "Your Ussuals", fontWeight = FontWeight.Bold, fontSize = 20.sp)
    Row(modifier = Modifier
        .horizontalScroll(scrollState)
        .padding(20.dp)) {

        Card() {
            Image(painter = painterResource(id = R.drawable.pizza),
                contentDescription = "cartoon3",
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = RectangleShape))

        }
        Spacer(modifier = Modifier.size(20.dp))
        Card() {
            Image(painter = painterResource(id = R.drawable.image7),
                contentDescription = "cartoon3",
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = RectangleShape))

        }
        Spacer(modifier = Modifier.size(20.dp))
        Card() {
            Image(painter = painterResource(id = R.drawable.pizza),
                contentDescription = "cartoon3",
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = RectangleShape))

        }

        Spacer(modifier = Modifier.size(20.dp))

        Card() {
            Image(painter = painterResource(id = R.drawable.pizza),
                contentDescription = "cartoon3",
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = RectangleShape))

        }
    }
    }

}

@Preview(showBackground = true)
@Composable
fun mylticardsPreview(){
    multicards()

}