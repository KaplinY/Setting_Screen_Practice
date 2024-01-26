package com.littlelemon.settingsscreen.mutedperson

import com.littlelemon.settingsscreen.R

object MutedPersons {
    val mutedpersonsList = mutableListOf(
        MutedPersonItem(R.drawable.user, "Lisa Anderson", "World of Women", muted = true),
        MutedPersonItem(R.drawable.user,"Hannah Morris", "A Trip down memory...", muted = true),
        MutedPersonItem(R.drawable.user,"Hannah Morris", "My life as a gangster", muted = false),
    )
}