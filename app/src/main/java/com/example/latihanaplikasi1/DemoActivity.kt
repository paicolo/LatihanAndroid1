package com.example.latihanaplikasi1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class DemoActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            Column(modifier = Modifier.fillMaxWidth()) {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Red
                ) {
                    Text(
                        text = "Mantappu",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 4.dp),
                        color = Color.Magenta
                    )
                }

                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = Color.Red
                ) {
                    Text(
                        text = "Jiwa",
                        modifier = Modifier.padding(16.dp, 0.dp, 16.dp, 4.dp),
                        color = Color.Black
                    )
                }
            }
        }
    }
}