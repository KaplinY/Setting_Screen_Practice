package com.littlelemon.networkscreen

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.littlelemon.networkscreen.ui.theme.ButtonsColor
import com.littlelemon.networkscreen.ui.theme.Purple40


@Composable
fun TopNav(){

    Row(
        verticalAlignment = Alignment.CenterVertically){
        IconButton(onClick = { /*TODO*/ },
            modifier = Modifier
                .size(45.dp)
                .padding(start = 20.dp, top = 20.dp),
        content = {
            Icon(
                painter = painterResource(id = R.drawable.bell),
                tint = Color.Black,
                contentDescription = "ring action",
            )
        })
        IconButton(onClick = { /*TODO*/ },
            modifier = Modifier
                .size(42.dp)
                .padding(start = 10.dp, top = 20.dp),
            content = {
                Icon(
                    painter = painterResource(id = R.drawable.rightarrow),
                    tint = Color.Black,
                    contentDescription = "ring action",
                )
            })
        Text("Relations", color = Color.Black, fontSize = 16.sp, textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 70.dp, top = 20.dp), fontWeight = FontWeight.SemiBold)
        //Spacer(Modifier.weight(1f))
        Button(onClick = { /*TODO*/ }, contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.buttonColors(containerColor = ButtonsColor),
            modifier = Modifier.padding(end = 12.dp, top = 20.dp, start = 55.dp)
                .size(height = 33.dp, width = 75.dp)
                .clip(shape = RoundedCornerShape(50))
//                .background(color = ButtonsColor),
        ) {
            Icon(
                painter = painterResource(id = R.drawable.addgroup),
                tint = Color.White,
                contentDescription = "add plus",
                modifier = Modifier.size(15.dp)
            )
            Spacer(modifier = Modifier.size(5.dp))
            Text(text = "Add", color = Color.White, fontSize = 12.sp, fontWeight = FontWeight.Bold)
        }
    }
}