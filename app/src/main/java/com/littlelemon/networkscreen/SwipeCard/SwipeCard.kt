@file:OptIn(ExperimentalWearMaterialApi::class)

package com.littlelemon.networkscreen.SwipeCard

import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.ExperimentalWearMaterialApi
import kotlin.math.roundToInt
import com.littlelemon.networkscreen.R

enum class DragAnchors {
    Start,
    End,
    End2,
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SwipeCard(name: String, aspect: String) {
    val density = LocalDensity.current
    val state = remember {
        AnchoredDraggableState(
            initialValue = DragAnchors.Start,
            positionalThreshold = { distance: Float -> distance * 0.5f },
            velocityThreshold = { with(density) { 100.dp.toPx() } },
            animationSpec = tween(),
        ).apply {
            updateAnchors(
                DraggableAnchors {
                    DragAnchors.Start at 0f
                    DragAnchors.End at 400f
                    DragAnchors.End2 at -300f
                }
            )
        }
    }
//    LazyColumn(verticalArrangement = Arrangement.spacedBy(15.dp)
//    ){
//        items(
//            items = persons.items,
//            itemContent = {swipeCardItem: SwipeCardItem ->
                Box {
                    IconButtonRow()
                    Box(modifier = Modifier
                        .padding(start = 10.dp)
                        .size(width = 365.dp, height = 100.dp)
                        .offset {
                            IntOffset(
                                x = state
                                    .requireOffset()
                                    .roundToInt(),
                                y = 0,
                            )
                        }
                        .anchoredDraggable(state, Orientation.Horizontal)
                        .clip(RoundedCornerShape(10.dp))
                        .background(color = Color.White)

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.person),
                            modifier = Modifier
                                .size(100.dp)
                                .align(Alignment.CenterStart)
                                .clip(RoundedCornerShape(10.dp)),
                            contentDescription = null,

                            )
                        Text(
                            text = name,
                            modifier = Modifier.padding(start = 100.dp),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = aspect,
                            modifier = Modifier.padding(start = 100.dp, top = 20.dp),
                            fontSize = 10.sp,
                            color = Color.Blue
                        )
                        IconButton(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .size(45.dp)
                                .padding(10.dp)
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.plus),
                                contentDescription = null,
                                tint = Color.LightGray
                            )

                        }

                    }

                }
            }
//        )
//    }
//}
//

