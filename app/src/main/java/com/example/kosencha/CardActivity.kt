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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kosencha.ui.theme.KosenchaTheme

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mycards()
        }
    }
}

@Composable
fun mycards(){
    var scrollState= rememberScrollState()
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollState), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "BREED DOGS")
        Card(modifier = Modifier
            .background(color = Color.Gray)
            .padding(all = 30.dp)) {
            Column(modifier = Modifier
                .padding(all = 12.dp)) {
                Text(text = "Bulldog", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                Image(painter = painterResource(id = R.drawable.image1),
                    contentDescription = "dogimage",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(shape = CircleShape))
                
            }
            
        }

        Spacer(modifier = Modifier.size(20.dp))

        Card(modifier = Modifier
            .background(color = Color.DarkGray)
            .padding(all = 30.dp)) {
            Column(modifier = Modifier
                .padding(all = 12.dp)) {
                Text(text = "Shepherd", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                Image(painter = painterResource(id = R.drawable.image2),
                    contentDescription = "Germanimage",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(shape = CircleShape))

            }

        }

        Spacer(modifier = Modifier.size(20.dp))


        Card(modifier = Modifier
            .background(color = Color.Gray)
            .padding(all = 30.dp)) {
            Column(modifier = Modifier
                .padding(all = 12.dp)) {
                Text(text = "Boxer", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                Image(painter = painterResource(id = R.drawable.image3),
                    contentDescription = "dogimage",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(shape = CircleShape))

            }

        }

        Spacer(modifier = Modifier.size(20.dp))

        Card(modifier = Modifier
            .background(color = Color.DarkGray)
            .padding(all = 30.dp)) {
            Column(modifier = Modifier
                .padding(all = 12.dp)) {
                Text(text = "Fluffy", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                Image(painter = painterResource(id = R.drawable.image4),
                    contentDescription = "dogimage",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(shape = CircleShape))

            }

        }

        Spacer(modifier = Modifier.size(20.dp))

        Card(modifier = Modifier
            .background(color = Color.Gray)
            .padding(all = 30.dp)) {
            Column(modifier = Modifier
                .padding(all = 12.dp)) {
                Text(text = "Pinscher", fontSize = 20.sp, fontStyle = FontStyle.Italic)
                Image(painter = painterResource(id = R.drawable.image5),
                    contentDescription = "dogimage",
                    modifier = Modifier
                        .size(200.dp)
                        .clip(shape = CircleShape))

            }

        }
        
        
    }
    
}

@Preview(showBackground = true)
@Composable
fun mycardsPreview(){
    mycards()
}