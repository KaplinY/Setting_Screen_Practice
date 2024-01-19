package com.littlelemon.networkscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.littlelemon.networkscreen.ui.theme.NetworkScreenTheme
import com.littlelemon.networkscreen.TopNav
import com.littlelemon.networkscreen.NetwSearchBar
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import com.littlelemon.networkscreen.SwipeCard.SwipeCard
import com.littlelemon.networkscreen.ui.theme.BackGroundColor
import androidx.compose.foundation.lazy.LazyColumn
import kotlinx.coroutines.flow.MutableStateFlow
import com.littlelemon.networkscreen.SwipeCard.SwipeCardItem
import com.littlelemon.networkscreen.NamesList.namesList
import com.littlelemon.networkscreen.PersonsList.personsList
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import com.littlelemon.networkscreen.NetworkScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface( modifier = Modifier.fillMaxSize(),) {
                    NetworkScreen()
                }
            }
        }
    }
}


