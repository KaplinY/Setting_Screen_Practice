package com.littlelemon.settingsscreen.navigationItems

import android.content.Intent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.littlelemon.settingsscreen.MainActivity
import com.littlelemon.settingsscreen.R
import com.littlelemon.settingsscreen.ui.theme.BackButtonColor

@Composable
fun BackSettingsButton(intent: Intent){

    val context = LocalContext.current

    TextButton(onClick = { context.startActivity(intent)},
        contentPadding = PaddingValues(0.dp)
    ) {
        Icon(
            painterResource(id = R.drawable.leftarrow),
            contentDescription = "back arrow icon",
            modifier = Modifier.size(height = 20.dp, width = 20.dp),
            tint = BackButtonColor
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text("Settings", color = BackButtonColor,
            fontFamily = FontFamily(Font(R.font.montserratregular)),
            fontSize = 14.sp,
            fontWeight = FontWeight(600)
        )
    }
}