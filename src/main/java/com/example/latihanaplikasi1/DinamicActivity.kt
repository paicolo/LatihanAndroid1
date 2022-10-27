package com.example.latihanaplikasi1

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import java.lang.reflect.Modifier

class DinamicActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            EchoText()
        }
    }

}
@Preview
@Composable
fun EchoText(){
    var displayedText = remember() {
    mutableStateOf("")
        
    }
if (displayedText.isNotEmpty()){
    Text(text = "Halo dek" + displayedText)
}
    Column() {
        horizontalAligment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
        Text(text = "Assalamualaikum papi")
        OutlinedTextField(
            value = "Default Value",
            onValueChange = {
                displayedText.value = it
            },
        label = Text(text = "Nama"))

    }
}