package com.example.quotify.presentation.navigation

sealed class AppRoutes(
    val route: String,
    val title: String) {

    object HomeScreen: AppRoutes("home", "HOME")
    object ExploreScreen: AppRoutes("explore", "EXPLORE")
    object SavedScreen: AppRoutes("saved", "SAVED")

}