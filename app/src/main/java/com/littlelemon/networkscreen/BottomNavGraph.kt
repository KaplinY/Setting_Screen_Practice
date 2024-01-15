package com.littlelemon.networkscreen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Relations.route
    ) {
        composable(route = BottomBarScreen.Relations.route) {
            NetworkScreen()
        }
        composable(route = BottomBarScreen.Inbox.route) {
            InboxScreen()
        }
        composable(route = BottomBarScreen.Treets.route) {
            TreetsScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
    }
}