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
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material3.SwitchColors
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.littlelemon.settingsscreen.ui.theme.BackButtonColor
import com.littlelemon.settingsscreen.ui.theme.SettingsScreenTheme
import com.littlelemon.settingsscreen.ui.theme.switchColor
import com.littlelemon.settingsscreen.ui.theme.uncheckedswitchColor

class ProfileSettings : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { SettingsScreenTheme {
            Settings()
        }

        }
    }

    @Composable
    fun Settings() {
        Column (
            modifier = Modifier.padding(start = 19.dp, top =28.dp),
            verticalArrangement = Arrangement.spacedBy(0.dp)
        ){

            TextButton(onClick = { Intent(applicationContext,MainActivity::class.java).also {
                startActivity(it) }}, modifier = Modifier.padding(bottom = 17.dp),
                contentPadding = PaddingValues(0.dp)
            ) {
                Icon(painterResource(id = R.drawable.leftarrow),
                    contentDescription = "back arrow icon",
                    modifier = Modifier.size(height = 20.dp, width = 20.dp),
                    tint = BackButtonColor)
                Spacer(modifier = Modifier.width(8.dp))
                Text("Back", color = BackButtonColor,
                    fontFamily = FontFamily(Font(R.font.montserratregular)),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(600)
                )
            }

            val intentAccount = Intent(applicationContext,Account::class.java)
            TextButton("Account",intentAccount,R.drawable.user)
            val intentPreferredAspects = Intent(applicationContext,PreferredAspects::class.java)
            val intentFutureScreens = Intent(applicationContext, FutureActivity::class.java)
            TextButton("Preferred Aspects",intentPreferredAspects,R.drawable.star)
            TextButton("Muted Aspects",intentFutureScreens,R.drawable.mute)
            TextButton("Hidden Posts",intentFutureScreens,R.drawable.book)
            TextButton("Hidden Treets",intentFutureScreens,R.drawable.present)
            TextButton("Pin code",intentFutureScreens,R.drawable.pincode)
            SwitchRow("Login with pin code", R.drawable.key, true)
            SwitchRow("Login with biometrics", R.drawable.facedetection, false)
            RedButton(text = "Sign out", id = R.drawable.logout)
            RedButton(text = "Delete account", id = R.drawable.trashred)
        }
    }
    @Composable
    fun TextButton(text: String, intent: Intent, id: Int){

        val fonfamily = R.font.montserratregular

        TextButton(onClick = { intent.also {
            startActivity(it) } },
            shape = RectangleShape,
            contentPadding = PaddingValues(0.dp),
            modifier = Modifier
                .size(width = 370.dp, height = 58.dp)
                .padding(start = 4.dp)
                .drawBehind {
                    val borderSize = 1.dp.toPx()
//                    drawLine(
//                        color = Color.LightGray,
//                        start = Offset(0f, size.height),
//                        end = Offset(size.width, size.height),
//                        strokeWidth = borderSize
//                    )
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
                Text(text, color = Color.Black, fontFamily = FontFamily(Font(fonfamily)),
                    fontWeight = FontWeight(600), fontSize = 14.sp)
                Spacer(modifier= Modifier
                    .weight(4f)
                    .fillMaxHeight())
                Icon(
                    painterResource(id = R.drawable.next),
                    contentDescription = "next arrow",
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .size(14.dp),
                    tint = Color.Gray
                )

            }
        }
    }
    @Composable
    fun SwitchRow (text: String, id: Int, checked: Boolean){

        val fonfamily = R.font.montserratregular

        Row (modifier = Modifier
            .fillMaxWidth()
            .size(width = 370.dp, height = 58.dp)
            .drawBehind {
                val borderSize = 1.dp.toPx()
//                drawLine(
//                    color = Color.LightGray,
//                    start = Offset(0f, size.height),
//                    end = Offset(size.width, size.height),
//                    strokeWidth = borderSize
//                )
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
            Text(text, color = Color.Black, fontFamily = FontFamily(Font(fonfamily)),
                fontWeight = FontWeight(600),
                fontSize = 14.sp,
            )
            Spacer(modifier= Modifier
                .weight(4f)
                .fillMaxHeight())
            val checkedState = remember { mutableStateOf(checked) }
            Switch(
                modifier = Modifier.padding(end = 12.dp),
                checked = checkedState.value,
                onCheckedChange = {
                    checkedState.value = it
                },
                colors = SwitchDefaults.colors(
                    checkedTrackColor = switchColor,
                    uncheckedBorderColor = Color.Transparent,
                    uncheckedTrackColor = uncheckedswitchColor,
                    uncheckedThumbColor = Color.White,
                )
            )
        }
    }
    @Composable
    fun RedButton(text: String, id: Int)
    {
        val fonfamily = R.font.montserratregular

        TextButton(onClick = { /*Todo*/ },
            shape = RectangleShape,
            modifier = Modifier
                .size(width = 370.dp, height = 58.dp)
                .drawBehind {
                    val borderSize = 1.dp.toPx()
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
                Text(text, color = Color.Red, fontFamily = FontFamily(Font(fonfamily)),
                    fontWeight = FontWeight(600), fontSize = 14.sp)
            }
        }
    }
}