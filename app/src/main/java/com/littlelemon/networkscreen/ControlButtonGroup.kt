package com.littlelemon.networkscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.littlelemon.networkscreen.ui.theme.ButtonsColor
import com.littlelemon.networkscreen.ui.theme.ButtonsOffColor

@Composable
fun ControlButtonGroup(){
    Row (modifier = Modifier.padding(start = 18.dp)){
        TextButton(onClick = { /*TODO*/ }, contentPadding = PaddingValues(0.dp),  modifier = Modifier
            .clip(shape = RoundedCornerShape(30.dp))
            .background(color = ButtonsColor)
            .size(width = 90.dp, height = 21.dp),
            ) {
            Text(text = "Relations", color = Color.White, fontSize = 12.sp, textAlign = TextAlign.Center)
        }
        Spacer(modifier = Modifier.padding(5.dp))
        TextButton(onClick = { /*TODO*/ }, contentPadding = PaddingValues(0.dp),  modifier = Modifier
            .clip(shape = RoundedCornerShape(30.dp))
            .background(color = ButtonsOffColor)
            .size(width = 90.dp, height = 21.dp),
        ) {
            Text(text = "Business", color = Color.DarkGray, fontSize = 12.sp, textAlign = TextAlign.Center)
        }
    }
}

