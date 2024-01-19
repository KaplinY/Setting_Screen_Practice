package com.littlelemon.networkscreen.SwipeCard

data class SwipeCardItem(
    val name: String,
    val aspects: String,
)

data class SquareCardItem(
    val name: String,
)

data class Names(val items: List<SquareCardItem>)
data class Persons(val items: List<SwipeCardItem>)