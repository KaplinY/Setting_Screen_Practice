package com.littlelemon.networkscreen

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
fun IconButtonRow(){
    val openAlertDialog = remember { mutableStateOf(false) }
    when {
        openAlertDialog.value -> {
            val dialogWidth = 261.dp
            val dialogHeight = 157.dp
            Dialog(
                onDismissRequest = { openAlertDialog.value = false },

            ){
                Box(

                    Modifier
                        .size(dialogWidth, dialogHeight)
                        .clip(shape = RoundedCornerShape(10))
                        .background(Color.White))
                    {Column(horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center) {
                            Text(text = "Delete Relation", fontWeight = FontWeight.Bold,
                                fontSize = 20.sp, modifier = Modifier.padding(top = 17.dp))
                            Text(text = "Are you sure you want to delete this relation?",
                                textAlign = TextAlign.Center, modifier = Modifier
                                    .padding(start = 40.dp, end = 40.dp))
                        Spacer(modifier=Modifier.weight(1f))
                        Row {
                            TextButton(
                                onClick = { openAlertDialog.value = false },
                                modifier = Modifier.clip(shape = RectangleShape)
                                    .fillMaxWidth(0.5f)
                            ) {
                                Text(text = "No", color = Color.Blue)
                            }
                            TextButton(
                                onClick = { /*ToDo*/ },
                                modifier = Modifier.clip(shape = RectangleShape)
                                    .fillMaxWidth(0.5f)
                            ) {
                                Text(text = "Delete", color = Color.Red)
                            }
                        }
                        }
                    }
            }
        }
    }
    Row {
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(start = 30.dp, top = 20.dp)
                .size(40.dp)
                .clip(shape = CircleShape)
                .background(Color.LightGray)


        ) {
            Icon(painter = painterResource(id = R.drawable.phone), contentDescription = null,
                modifier = Modifier.size(25.dp))
        }
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(start = 30.dp, top = 20.dp)
                .size(40.dp)
                .clip(shape = CircleShape)
                .background(Color.LightGray)


        ) {
            Icon(painter = painterResource(id = R.drawable.message), contentDescription = null,
                modifier = Modifier.size(25.dp))
        }
        IconButton(
            onClick = { openAlertDialog.value = true },
            modifier = Modifier
                .padding(start = 150.dp, top = 20.dp)
                .size(40.dp)
                .clip(shape = CircleShape)
                .background(Color.LightGray)


        ) {
            Icon(painter = painterResource(id = R.drawable.trashred), contentDescription = null,
                modifier = Modifier.size(25.dp), tint = Color.Red)
        }
    }
}