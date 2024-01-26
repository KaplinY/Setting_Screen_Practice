package com.littlelemon.settingsscreen.prefferedperson

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.littlelemon.settingsscreen.R
import com.littlelemon.settingsscreen.ui.theme.switchColor

@Composable
fun PreferredPersonRow(picture: Int, treat: String, muted: Boolean){

    Row (verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.size(height = 61.dp, width = 390.dp)
            .drawBehind {
                val borderSize = 1.dp.toPx()
                drawLine(
                    color = Color.LightGray,
                    start = Offset(0f, 0f),
                    end = Offset(size.width, 0f),
                    strokeWidth = borderSize
                )
            }){
        Image(painter = painterResource(id = picture), contentDescription = null,
            modifier = Modifier.size(40.dp).padding(end = 15.dp))


        Text(text = treat,
            fontFamily = FontFamily(Font(R.font.montserratregular)),
            fontWeight = FontWeight(600),
            fontSize = 12.sp)

        Spacer(Modifier.weight(1f).fillMaxHeight())
        if (muted){
            RemoveButton()
        }
        else{
            PreferButton()
        }

    }
}

@Composable
fun RemoveButton(){
    Button(onClick = { /*TODO*/ },
        contentPadding = PaddingValues(0.dp),
        modifier = Modifier.size(width = 73.dp, height = 28.dp),
        colors = ButtonDefaults.buttonColors(switchColor)) {
        Text(
            text = "Remove",
            fontWeight = FontWeight(700),
            fontFamily = FontFamily(Font(R.font.montserratregular)),
            fontSize = 10.sp,
            color = Color.White
        )
    }
}

@Composable
fun PreferButton(){
    Button(onClick = { /*TODO*/ },
        contentPadding = PaddingValues(0.dp),
        modifier = Modifier.size(width = 63.dp, height = 28.dp),
        colors = ButtonDefaults.buttonColors(switchColor)) {
        Text(
            text = "Prefer",
            fontWeight = FontWeight(700),
            fontSize = 10.sp,
            fontFamily = FontFamily(Font(R.font.montserratregular)),
        )
    }
}