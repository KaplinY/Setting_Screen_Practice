package com.littlelemon.settingsscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.littlelemon.settingsscreen.mutedperson.MutedPersonItem
import com.littlelemon.settingsscreen.mutedperson.MutedPersonRow
import com.littlelemon.settingsscreen.mutedperson.MutedPersons
import com.littlelemon.settingsscreen.mutedperson.Names
import com.littlelemon.settingsscreen.navigationItems.BackSettingsButton
import com.littlelemon.settingsscreen.navigationItems.MySearchBar
import com.littlelemon.settingsscreen.prefferedperson.PreferedPersonItem
import com.littlelemon.settingsscreen.prefferedperson.PreferredNames
import com.littlelemon.settingsscreen.prefferedperson.PreferredPersonRow
import com.littlelemon.settingsscreen.prefferedperson.PreferredPersons
import kotlinx.coroutines.flow.MutableStateFlow

private val preferredpersonsState: MutableStateFlow<PreferredNames> =
    MutableStateFlow(PreferredNames(PreferredPersons.preferredpersonsList))

class Preffered : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContent{
                PrefferedScreen()
            }
    }
}

@Composable
fun PrefferedScreen() {

    val intent = Intent(LocalContext.current, ProfileSettings::class.java)
    val preferredpersons by preferredpersonsState.collectAsState()

    Column (modifier = Modifier.padding(start = 20.dp, end = 17.dp)){
        Spacer(modifier = Modifier.size(33.dp))
        BackSettingsButton(intent = intent)
        Spacer(modifier = Modifier.size(20.dp))
        MySearchBar()
        Spacer(modifier = Modifier.size(30.dp))
        LazyColumn(modifier = Modifier.padding(start = 4.dp)) {
            items(
                items = preferredpersons.items,
                itemContent = { preferredPersonItem: PreferedPersonItem ->
                    PreferredPersonRow(
                        preferredPersonItem.picture,
                        preferredPersonItem.treat,
                        preferredPersonItem.preferred,
                    )
                }
            )
        }
    }
}