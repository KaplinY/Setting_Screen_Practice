package com.littlelemon.settingsscreen

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VoiceInteractionSession.ActivityId
import android.widget.Switch
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

class ProfileSettings : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { 
            Settings()
        }
    }

    @Composable
    fun Settings() {
        Column (
            modifier = Modifier
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(0.dp)
        ){

            TextButton(onClick = { Intent(applicationContext,MainActivity::class.java).also {
                startActivity(it) }}) {
                Image(painterResource(id = R.drawable.leftarrow),
                    contentDescription = "back arrow icon",
                    modifier = Modifier.size(20.dp))
                Spacer(modifier = Modifier.width(10.dp))
                Text("Back", color = Color.Blue)
            }
            val intentAccount = Intent(applicationContext,Account::class.java)
            TextButton("Account",intentAccount,R.drawable.user)
            val intentPreferredAspects = Intent(applicationContext,PreferredAspects::class.java)
            TextButton("Preferred Aspects",intentPreferredAspects,R.drawable.star)
            TextButton("Muted Aspects",intentAccount,R.drawable.mute)
            TextButton("Hidden Posts",intentAccount,R.drawable.book)
            TextButton("Hidden Treets",intentAccount,R.drawable.present)
            TextButton("Pin code",intentAccount,R.drawable.pincode)
            SwitchRow("Login with pin code", R.drawable.key, true)
            SwitchRow("Login with biometrics", R.drawable.facedetection, false)
            RedButton(text = "Sign out", id = R.drawable.logout)
            RedButton(text = "Delete account", id = R.drawable.trashred)
        }
    }
    @Composable
    fun TextButton(text: String, intent: Intent, id: Int){
        TextButton(onClick = { intent.also {
            startActivity(it) } },
            shape = RectangleShape,
            modifier = Modifier
                .size(width = 420.dp, height = 61.dp)
                .drawBehind {
                    val borderSize = 2.dp.toPx()
                    drawLine(
                        color = Color.LightGray,
                        start = Offset(0f, size.height),
                        end = Offset(size.width, size.height),
                        strokeWidth = borderSize
                    )
                    drawLine(
                        color = Color.LightGray,
                        start = Offset(0f, 0f),
                        end = Offset(size.width, 0f),
                        strokeWidth = borderSize
                    )
                }) {
            Row (modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically){
                Image(
                    painterResource(id = id),
                    contentDescription = "back arrow icon",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text, color = Color.Black)
                Spacer(modifier= Modifier
                    .weight(1f)
                    .fillMaxHeight())
                Image(
                    painterResource(id = R.drawable.next),
                    contentDescription = "next arrow",
                    modifier = Modifier.size(14.dp)
                )

            }
        }
    }
    @Composable
    fun SwitchRow (text: String, id: Int, checked: Boolean){
        Row (modifier = Modifier
            .fillMaxWidth()
            .size(width = 420.dp, height = 61.dp)
            .drawBehind {
                val borderSize = 2.dp.toPx()
                drawLine(
                    color = Color.LightGray,
                    start = Offset(0f, size.height),
                    end = Offset(size.width, size.height),
                    strokeWidth = borderSize
                )
                drawLine(
                    color = Color.LightGray,
                    start = Offset(0f, 0f),
                    end = Offset(size.width, 0f),
                    strokeWidth = borderSize
                )
            },
            verticalAlignment = Alignment.CenterVertically){
            Spacer(modifier = Modifier.width(10.dp))
            Image(painterResource(id = id),
                contentDescription = "key image",
                modifier = Modifier.size(20.dp))
            Spacer(modifier = Modifier.width(10.dp))
            Text(text, color = Color.Black,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier= Modifier
                .weight(1f)
                .fillMaxHeight())
            val checkedState = remember { mutableStateOf(checked) }
            Switch(
                checked = checkedState.value,
                onCheckedChange = {
                    checkedState.value = it
                }
            )
        }
    }
    @Composable
    fun RedButton(text: String, id: Int)
    {
        TextButton(onClick = { /*Todo*/ },
            shape = RectangleShape,
            modifier = Modifier
                .size(width = 420.dp, height = 61.dp)
                .drawBehind {
                    val borderSize = 2.dp.toPx()
                    drawLine(
                        color = Color.LightGray,
                        start = Offset(0f, size.height),
                        end = Offset(size.width, size.height),
                        strokeWidth = borderSize
                    )
                    drawLine(
                        color = Color.LightGray,
                        start = Offset(0f, 0f),
                        end = Offset(size.width, 0f),
                        strokeWidth = borderSize
                    )
                }) {
            Row (modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically){
                Image(
                    painterResource(id = id),
                    contentDescription = "back arrow icon",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text, color = Color.Red)
            }
        }
    }
}