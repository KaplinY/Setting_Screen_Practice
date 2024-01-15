package com.littlelemon.networkscreen

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
    val icon_focused: Int
) {
    data object Relations: BottomBarScreen(
        route = "relations",
        title = "Relations",
        icon = R.drawable.relationstr,
        icon_focused = R.drawable.relationsfill
    )

    data object Inbox: BottomBarScreen(
        route = "inbox",
        title = "Inbox",
        icon = R.drawable.inboxtr,
        icon_focused = R.drawable.inboxfill
    )

    data object Treets: BottomBarScreen(
        route = "treets",
        title = "Treets",
        icon = R.drawable.gift,
        icon_focused = R.drawable.giftfill
    )

    data object Profile: BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = R.drawable.user,
        icon_focused = R.drawable.userfill
    )

}