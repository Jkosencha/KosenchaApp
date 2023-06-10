package com.example.kosencha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kosencha.ui.theme.KosenchaTheme

class Card2Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mycard2()
        }
    }
}

@Composable
fun mycard2(){
    var scrollState= rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollState)) {
        Card(modifier = Modifier
            .background(color = Color.LightGray)
            .padding(all = 10.dp)) {
            Row(modifier = Modifier
                .padding(all = 12.dp)) {
                Image(painter = painterResource(id = R.drawable.image6),
                    contentDescription = "cartoon1",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(shape = RectangleShape))
                Text(text = "Panda", fontSize = 30.sp)


            }

        }

        Spacer(modifier = Modifier.size(20.dp))

        Card(modifier = Modifier
            .background(color = Color.LightGray)
            .padding(all = 10.dp)) {
            Row(modifier = Modifier
                .padding(all = 12.dp)) {
                Image(painter = painterResource(id = R.drawable.image7),
                    contentDescription = "cartoon2",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(shape = RectangleShape))
                Text(text = "Tom and Jerry", fontSize = 30.sp)


            }

        }

        Spacer(modifier = Modifier.size(20.dp))


        Card(modifier = Modifier
            .background(color = Color.LightGray)
            .padding(all = 10.dp)) {
            Row(modifier = Modifier
                .padding(all = 12.dp)) {
                Image(painter = painterResource(id = R.drawable.image8),
                    contentDescription = "cartoon3",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(shape = RectangleShape))
                Text(text = "Big Foot ", fontSize = 30.sp)


            }

        }

        Spacer(modifier = Modifier.size(20.dp))

        Card(modifier = Modifier
            .background(color = Color.LightGray)
            .padding(all = 10.dp)) {
            Row(modifier = Modifier
                .padding(all = 12.dp)) {
                Image(painter = painterResource(id = R.drawable.image2),
                    contentDescription = "cartoon4",
                    modifier = Modifier
                        .size(150.dp)
                        .clip(shape = RectangleShape))
                Text(text = "Tom and Jerry", fontSize = 30.sp)


            }

        }


    }

}

@Preview(showBackground = true)
@Composable
fun mycard2preview(){
    mycard2()
}