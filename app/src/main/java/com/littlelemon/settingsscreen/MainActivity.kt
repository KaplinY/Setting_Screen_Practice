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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    sheetContent = {
                    MyBottomSheet()
                }) {

                }
            }

        }
    }

    @Composable
    fun MyBottomSheet() {
        Column(
            modifier = Modifier
                .heightIn(min = 100.dp, max = 286.dp)
                .fillMaxSize()//Do this to make sheet expandable
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            FilledTonalButton(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(width = 366.dp, height = 40.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth()
                    ) {
                    Image(
                        painterResource(id = R.drawable.image_icon),
                        contentDescription = "image icon",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Change cover", color = Color.Black)
                }
            }
            FilledTonalButton(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(width = 366.dp, height = 40.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painterResource(id = R.drawable.user),
                        contentDescription = "person icon",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Show cover", color = Color.Black)
                }
            }
            FilledTonalButton(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(width = 366.dp, height = 40.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painterResource(id = R.drawable.trash),
                        contentDescription = "trash icon",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Delete cover", color = Color.Black)
                }
            }
            FilledTonalButton(onClick = { Intent(applicationContext,ProfileSettings::class.java).also {
                startActivity(it) } },
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(width = 366.dp, height = 40.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painterResource(id = R.drawable.settings),
                        contentDescription = "setting icon",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Profile settings", color = Color.Black)
                }
            }
            FilledTonalButton(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(width = 366.dp, height = 40.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painterResource(id = R.drawable.eye),
                        contentDescription = "eye icon",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Preview aspects", color = Color.Black)
                }
            }
        }
    }
}

