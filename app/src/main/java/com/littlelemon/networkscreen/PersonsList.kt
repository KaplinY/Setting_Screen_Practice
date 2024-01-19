package com.littlelemon.networkscreen

import com.littlelemon.networkscreen.SwipeCard.SquareCardItem
import com.littlelemon.networkscreen.SwipeCard.SwipeCardItem

object NamesList {
    val namesList = mutableListOf(
        SquareCardItem("Aaron"),
        SquareCardItem("Mike"),
        SquareCardItem("John"),
        SquareCardItem("Jake"),
        SquareCardItem("Larry"),
    )
}

object PersonsList {
    val personsList = mutableListOf(
        SwipeCardItem("Aaron Adams", aspects = "3 Aspects, 6 Treets"),
        SwipeCardItem("Elijah Foster", aspects = "3 Aspects, 6 Treets"),
        SwipeCardItem("Lucas Rivera", aspects = "3 Aspects, 6 Treets"),
        SwipeCardItem("Matthew Edwards", aspects = "3 Aspects, 6 Treets"),
        SwipeCardItem("Mike Johnes", aspects = "3 Aspects, 6 Treets"),
    )
}
