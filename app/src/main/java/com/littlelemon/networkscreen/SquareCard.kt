package com.littlelemon.networkscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SquareCard(names: Names){
    LazyRow (modifier = Modifier.padding(start = 18.dp, top = 20.dp, bottom = 18.dp),
        horizontalArrangement = Arrangement.spacedBy(15.dp)
    ){
        items(
            items = names.items,
            itemContent = {squareCardItem: SquareCardItem ->
                Box(
                    modifier = Modifier
                        .size(height = 100.dp, width = 90.dp)
                        .clip(shape = RoundedCornerShape(10))
                        .background(color = Color.White)
                        .shadow(1.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.person),
                            contentDescription = null,
                            modifier = Modifier
                                .size(width = 84.dp, height = 68.dp)
                                .clip(shape = RoundedCornerShape(10))
                        )
                        Spacer(modifier = Modifier.padding(3.dp))
                        Text(text = squareCardItem.name, color = Color.Black, textAlign = TextAlign.Center,
                            fontSize = 12.sp, fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        )
    }
}