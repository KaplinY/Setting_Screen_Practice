package com.littlelemon.settingsscreen.prefferedperson

import com.littlelemon.settingsscreen.R
import com.littlelemon.settingsscreen.mutedperson.MutedPersonItem

object PreferredPersons {
    val preferredpersonsList = mutableListOf(
        PreferedPersonItem(R.drawable.user, "World of Women", preferred = true),
        PreferedPersonItem(R.drawable.user, "A Trip down memory...", preferred = true),
        PreferedPersonItem(R.drawable.user,"My life as a gangster", preferred = false),
    )
}