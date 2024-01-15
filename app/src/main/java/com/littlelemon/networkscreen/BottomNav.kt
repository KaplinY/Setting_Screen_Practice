package com.littlelemon.networkscreen

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController



@Composable
fun BottomBar(navController: NavHostController) {
    

    val navStackBackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navStackBackEntry?.destination



    Row (modifier = Modifier
        .clip(shape = RoundedCornerShape(10.dp))
        .size(height = 123.dp, width = 393.dp)
        .background(color = Color.Transparent)
        .padding(vertical = 10.dp)
        .drawBehind { drawRoundRect(color = Color.White, size = Size(width = 1078f, height = 200f),
            topLeft = Offset(0f,130f), cornerRadius = CornerRadius(40f, 40f)
        )},
        verticalAlignment = Alignment.Bottom
        ){
        TextButton(onClick = { /*TODO*/ },
            modifier = Modifier
                .size(height = 60.dp, width = 80.dp)
                .padding(top = 10.dp)
                ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    painter = painterResource(id = R.drawable.relationsfill),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp),
                    tint = Color.Black
                )
                Text(text = "Relations", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                    fontSize = 10.sp, color = Color.Black)
            }
        }
        TextButton(onClick = { /*TODO*/ },
            modifier = Modifier
                .size(height = 60.dp, width = 80.dp)
                .padding(top = 10.dp)) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    painter = painterResource(id = R.drawable.inboxtr),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp),
                    tint = Color.Black
                )
                Text(text = "Inbox", textAlign = TextAlign.Center, fontSize = 10.sp,
                    color = Color.Black)
            }
        }

        Column (horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(bottom = 9.dp)){

            ElevatedButton(onClick = { /*TODO*/ }, modifier = Modifier.clip(shape = CircleShape).
            size(70.dp).background(color = Color.LightGray).shadow(2.dp)) {

            }
            Text(
                text = "Explore",
                fontSize = 10.sp,
                color = Color.Black,
                modifier = Modifier.padding(top = 8.dp)
            )
        }



        TextButton(onClick = { /*TODO*/ },
            modifier = Modifier
                .size(height = 60.dp, width = 80.dp)
                .padding(top = 10.dp)) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    painter = painterResource(id = R.drawable.gift),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp),
                    tint = Color.Black
                )
                Text(text = "Treets", textAlign = TextAlign.Center, fontSize = 10.sp,
                    color = Color.Black)
            }
        }
        TextButton(onClick = { /*TODO*/ },
            modifier = Modifier
                .size(height = 60.dp, width = 80.dp)
                .padding(top = 10.dp)) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(
                    painter = painterResource(id = R.drawable.user),
                    contentDescription = null,
                    modifier = Modifier.size(20.dp),
                    tint = Color.Black
                )
                Text(text = "Profile", textAlign = TextAlign.Center, fontSize = 10.sp,
                    color = Color.Black)
            }
        }
    }
}


