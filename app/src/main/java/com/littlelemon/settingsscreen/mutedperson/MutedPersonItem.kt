package com.littlelemon.settingsscreen.mutedperson

data class MutedPersonItem (
    val picture: Int,
    val name: String,
    val treat: String,
    val muted: Boolean
)

data class Names(val items: List<MutedPersonItem>)