package com.littlelemon.settingsscreen

import android.content.Intent
import android.graphics.drawable.shapes.Shape
import android.media.Image
import android.os.Bundle
import android.widget.PopupMenu
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.littlelemon.settingsscreen.ui.theme.BottomSheetColor
import com.littlelemon.settingsscreen.ui.theme.ButtonLightGrey
import com.littlelemon.settingsscreen.ui.theme.SettingsScreenTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SettingsScreenTheme {
                Text(text = "Hello!")
                BottomSheetScaffold(
                    sheetShape = RoundedCornerShape(20.dp),
                    sheetPeekHeight = 50.dp,
                    sheetShadowElevation = 8.dp,
                    sheetTonalElevation = 8.dp,
                    sheetContainerColor = BottomSheetColor,
                    sheetContent = {
                    MyBottomSheet()
                }) {

                }
            }

        }
    }

    @Composable
    fun MyBottomSheet() {
        val profileSettingIntent = Intent(applicationContext,ProfileSettings::class.java)
        val intent = Intent(applicationContext, FutureActivity::class.java)
        Column(
            modifier = Modifier
                .heightIn(min = 80.dp, max = 289.dp).padding(start = 22.dp, end = 22.dp,
                    bottom = 20.dp),

            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            ButtonBottomSheet(text = "Change cover", intent = intent, id = R.drawable.image_icon)

            ButtonBottomSheet(text = "Show cover", intent = intent, id = R.drawable.user)

            ButtonBottomSheet(text = "Delete cover", intent = intent, id = R.drawable.trash)

            ButtonBottomSheet(text = "Profile setting", intent = profileSettingIntent, id = R.drawable.settings)

            ButtonBottomSheet(text = "Preview aspects", intent = intent, id = R.drawable.eye)

        }
    }

    @Composable
    fun ButtonBottomSheet(text: String, intent: Intent, id: Int){
        FilledTonalButton(onClick = { intent.also { startActivity(it) } },
            colors = ButtonDefaults.buttonColors(containerColor = ButtonLightGrey),
            shape = RoundedCornerShape(9.dp),
            modifier = Modifier.size(width = 366.dp, height = 40.dp),
            contentPadding = PaddingValues(0.dp)
        ) {
            Row(modifier = Modifier.fillMaxWidth().padding(start = 10.dp)
            ) {
                Image(
                    painterResource(id = id),
                    contentDescription = null,
                    modifier = Modifier.size(26.dp)
                )
                Spacer(modifier = Modifier.width(9.dp))
                Text(text = text, color = Color.Black, fontSize = 12.sp,
                    modifier = Modifier.padding(top = 5.dp),
                    fontFamily = FontFamily(Font(R.font.montserratregular)),
                    fontWeight = FontWeight(600)
                )
            }
        }
    }
}

