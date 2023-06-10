package com.example.kosencha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TextfieldActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            form()
        }
    }
}

@Composable
fun form(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Cyan)
        .padding(50.dp)) {
        Text(text = "PERSONAL DETAILS", fontSize = 30.sp, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold, textDecoration = TextDecoration.Underline)

        //Firstname
        var text by remember { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = {text= it},
            label = { Text(text = "Firstname") },
            modifier = Modifier.padding(20.dp),
            placeholder = { Text(text = "Enter firstname") },
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "icon")},
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            textStyle = TextStyle(color = Color.Black, fontStyle = FontStyle.Normal),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

        //Middlename
        var mname by remember { mutableStateOf("") }
        TextField(
            value = mname,
            onValueChange = {mname= it},
            label = { Text(text = "Middlename") },
            modifier = Modifier.padding(20.dp),
            placeholder = { Text(text = "Enter Middlename") },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "icon")},
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            textStyle = TextStyle(color = Color.Black, fontStyle = FontStyle.Normal),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        //Surname
        var sname by remember { mutableStateOf("") }
        TextField(
            value = sname,
            onValueChange = {sname= it},
            label = { Text(text = "Surname") },
            modifier = Modifier.padding(20.dp),
            placeholder = { Text(text = "Enter surname") },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "icon")},
            trailingIcon = { Icon(imageVector = Icons.Default.Check, contentDescription = "icon")},
            textStyle = TextStyle(color = Color.Black, fontStyle = FontStyle.Normal),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        //Email
        var myemail by remember { mutableStateOf("") }
        TextField(
            value = myemail,
            onValueChange = {myemail= it},
            label = { Text(text = "Email") },
            modifier = Modifier.padding(20.dp),
            placeholder = { Text(text = "Enter email") },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "icon")},
            textStyle = TextStyle(color = Color.Black, fontStyle = FontStyle.Normal),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        //Password
        var pass by remember { mutableStateOf("") }
        TextField(
            value = pass,
            onValueChange = {pass= it},
            label = { Text(text = "Password") },
            modifier = Modifier.padding(20.dp),
            placeholder = { Text(text = "Enter password") },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "icon")},
            textStyle = TextStyle(color = Color.Black, fontStyle = FontStyle.Normal),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )

        //Phonenumber
        var num by remember { mutableStateOf("") }
        TextField(
            value = num,
            onValueChange = {num= it},
            label = { Text(text = "Contact") },
            modifier = Modifier.padding(20.dp),
            placeholder = { Text(text = "Enter phone number") },
            leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "icon")},
            textStyle = TextStyle(color = Color.Black, fontStyle = FontStyle.Normal),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
        )





    }
}

@Preview(showBackground = true)
@Composable
fun formPreview(){
    form()
}
