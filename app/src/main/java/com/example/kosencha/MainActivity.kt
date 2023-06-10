package com.example.kosencha

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kosencha.ui.theme.KosenchaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            text()

        }
    }
}

@Composable
fun text() {
    val mContext= LocalContext.current
    Column(modifier = Modifier
        .background(color = Color.DarkGray)
        .padding(70.dp)
        .fillMaxSize()) {


        //First button
        Button(onClick = { mContext.startActivity(Intent(mContext,LayoutActivity::class.java))

        }, Modifier.padding(10.dp), shape = RectangleShape) {
            Text(text = "Layout")
        }

        //Second button
        Button(onClick = { mContext.startActivity(Intent(mContext,ImageActivity::class.java))

        }, Modifier.padding(10.dp), shape = RectangleShape) {
            Text(text = "image")
        }

        //Third button
        Button(onClick = { mContext.startActivity(Intent(mContext,PizzaActivity::class.java))

        }, Modifier.padding(10.dp), shape = RectangleShape) {
            Text(text = "pizza")
        }

        //Form button
        Button(onClick = { mContext.startActivity(Intent(mContext,TextfieldActivity::class.java))

        }, Modifier.padding(10.dp), shape = RectangleShape) {
            Text(text = "form")
        }

        //List button
        Button(onClick = { mContext.startActivity(Intent(mContext,ListActivity::class.java))

        }, Modifier.padding(10.dp), shape = RectangleShape) {
            Text(text = "mynumbers")
        }

        //Card button
        Button(onClick = { mContext.startActivity(Intent(mContext,CardActivity::class.java))

        }, Modifier.padding(10.dp), shape = RectangleShape) {
            Text(text = "mycards")
        }

        // button
        Button(onClick = { mContext.startActivity(Intent(mContext,Card2Activity::class.java))

        },Modifier.padding(10.dp), shape = RectangleShape) {

            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "icon")
            Text(text = "mycard2")
        }

        //Multicards button
        Button(onClick = { mContext.startActivity(Intent(mContext,MultiActivity::class.java))

        },Modifier.padding(10.dp), shape = RectangleShape) {
            Text(text = "multicards")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun textPreview() {
    text()

}