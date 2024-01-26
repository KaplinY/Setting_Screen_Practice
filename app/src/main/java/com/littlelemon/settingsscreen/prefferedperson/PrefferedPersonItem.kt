package com.littlelemon.settingsscreen.prefferedperson

data class PreferedPersonItem (
    val picture: Int,
    val treat: String,
    val preferred: Boolean
)

data class PreferredNames(val items: List<PreferedPersonItem>)