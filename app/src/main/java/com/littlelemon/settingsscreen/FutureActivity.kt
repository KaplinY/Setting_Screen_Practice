package com.littlelemon.settingsscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class FutureActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { FutureActivityScreen() }
    }

    @Composable
    fun FutureActivityScreen(){
        Text(text = "Not done yet")
    }
}