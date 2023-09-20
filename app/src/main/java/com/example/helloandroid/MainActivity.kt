package com.example.helloandroid

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloandroid.ui.theme.HelloAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Happy Birtday", from ="James" )
                }
            }
        }
    }
}

@Composable
fun Greeting(message: String,from: String, modifier: Modifier = Modifier)
{   Column (modifier = modifier, verticalArrangement = Arrangement.Center

){


    Text(
            text = message,
        fontSize = 100.sp,
        lineHeight = 116.sp,
        textAlign = TextAlign.Center


    )
    Text (text = from, fontSize = 36.sp, modifier = Modifier
            .padding(16.dp)
            .align(alignment = Alignment.End))
}
}
@Preview
    (showBackground = true,
    showSystemUi = true,
            name = "MainPreview")

@Composable
fun GreetingPreview() {
    HelloAndroidTheme {
        Greeting("Happy Birtday", from ="James" )
    }
}