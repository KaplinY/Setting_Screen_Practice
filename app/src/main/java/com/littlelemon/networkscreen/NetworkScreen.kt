package com.littlelemon.networkscreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.littlelemon.networkscreen.BottomNav.BottomBar
import com.littlelemon.networkscreen.SwipeCard.Names
import com.littlelemon.networkscreen.SwipeCard.Persons
import com.littlelemon.networkscreen.SwipeCard.SwipeCard
import com.littlelemon.networkscreen.SwipeCard.SwipeCardItem
import kotlinx.coroutines.flow.MutableStateFlow

private val namesState: MutableStateFlow<Names> =
    MutableStateFlow(Names(NamesList.namesList))

private val personsState: MutableStateFlow<Persons> =
    MutableStateFlow(Persons(PersonsList.personsList))

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NetworkScreen(){
    val names by namesState.collectAsState()
    val persons by personsState.collectAsState()
    Scaffold(bottomBar = {
        val navController = rememberNavController()

        BottomBar(navController = navController)
    }) {
        Column(
            modifier = Modifier.background(com.littlelemon.networkscreen.ui.theme.BackGroundColor)
        ) {

            TopNav()
            NetwSearchBar()
            com.littlelemon.networkscreen.ControlButtonGroup()
            com.littlelemon.networkscreen.SquareCard(names = names)

            LazyColumn(verticalArrangement = Arrangement.spacedBy(15.dp)) {
                items(
                    items = persons.items,
                    itemContent = { swipeCardItem: SwipeCardItem ->
                        SwipeCard(
                            swipeCardItem.name,
                            swipeCardItem.aspects
                        )
                    }
                )
            }
        }
    }
}