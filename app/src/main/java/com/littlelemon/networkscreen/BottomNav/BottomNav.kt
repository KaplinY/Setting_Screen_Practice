package com.littlelemon.networkscreen.BottomNav

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.littlelemon.networkscreen.R


@Composable
fun BottomBar(navController: NavHostController) {


    val navStackBackEntry by navController.currentBackStackEntryAsState()
    var navNum by remember {
        mutableStateOf(0)
    }

    Row(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(10.dp))
            .size(height = 123.dp, width = 393.dp)
            .background(color = Color.Transparent)
            .padding(vertical = 10.dp)
            .drawBehind {
                drawRoundRect(
                    color = Color.White, size = Size(width = 1078f, height = 200f),
                    topLeft = Offset(0f, 130f), cornerRadius = CornerRadius(40f, 40f)
                )
            },
        verticalAlignment = Alignment.Bottom
    ) {
        TextButton(
            onClick = { /*Todo*/ },
            modifier = Modifier
                .size(height = 60.dp, width = 80.dp)
                .padding(top = 10.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                if (navNum == 0) {
                    Icon(
                        painter = painterResource(id = R.drawable.relationsfill),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp),
                        tint = Color.Black
                    )
                } else {
                    Icon(
                        painter = painterResource(id = R.drawable.relationstr),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                            .clickable(onClick = { navNum = 0 }),
                        tint = Color.Black
                    )
                }

                Text(
                    text = "Relations", textAlign = TextAlign.Center, fontWeight = FontWeight.Bold,
                    fontSize = 10.sp, color = Color.Black
                )

            }
        }

        TextButton(
            onClick = { /*ToDo*/ },
            modifier = Modifier
                .size(height = 60.dp, width = 80.dp)
                .padding(top = 10.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                if (navNum == 1) {
                    Icon(
                        painter = painterResource(id = R.drawable.inboxfill),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp),
                        tint = Color.Black
                    )
                } else {
                    Icon(
                        painter = painterResource(id = R.drawable.inboxtr),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                            .clickable(onClick = { navNum = 1 }),
                        tint = Color.Black
                    )
                }
                Text(
                    text = "Inbox", textAlign = TextAlign.Center, fontSize = 10.sp,
                    color = Color.Black
                )
            }
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(bottom = 9.dp)
        ) {

            ElevatedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.clip(shape = CircleShape).size(70.dp)
                    .background(color = Color.LightGray).shadow(2.dp)
            ) {

            }
            Text(
                text = "Explore",
                fontSize = 10.sp,
                color = Color.Black,
                modifier = Modifier.padding(top = 8.dp)
            )
        }



        TextButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(height = 60.dp, width = 80.dp)
                .padding(top = 10.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                if (navNum == 2) {
                    Icon(
                        painter = painterResource(id = R.drawable.giftfill),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp),
                        tint = Color.Black
                    )
                } else {
                    Icon(
                        painter = painterResource(id = R.drawable.gift),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                            .clickable(onClick = { navNum = 2 }),
                        tint = Color.Black
                    )
                }
                Text(
                    text = "Treets", textAlign = TextAlign.Center, fontSize = 10.sp,
                    color = Color.Black
                )
            }
        }
        TextButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(height = 60.dp, width = 80.dp)
                .padding(top = 10.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                if (navNum == 3) {
                    Icon(
                        painter = painterResource(id = R.drawable.userfill),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp),
                        tint = Color.Black
                    )
                } else {
                    Icon(
                        painter = painterResource(id = R.drawable.user),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                            .clickable(onClick = { navNum = 3 }),
                        tint = Color.Black
                    )
                }
                Text(
                    text = "Profile", textAlign = TextAlign.Center, fontSize = 10.sp,
                    color = Color.Black
                )
            }
        }

    }
}



