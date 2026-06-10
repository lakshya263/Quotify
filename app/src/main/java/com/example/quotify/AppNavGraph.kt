package com.example.quotify

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.quotify.presentation.navigation.AppRoutes
import com.example.quotify.presentation.screens.ExploreScreen
import com.example.quotify.presentation.screens.HomeScreen

@Composable
fun AppNavGraph(
    modifier: Modifier,
    navController: NavHostController
) {

    NavHost(navController, startDestination = AppRoutes.HomeScreen.route) {

        composable(AppRoutes.HomeScreen.route) {
            HomeScreen(
                modifier = modifier,
                onNavigateToExplore = {
                    navController.navigate(AppRoutes.ExploreScreen.route)
                }
            )

        }

        composable(AppRoutes.ExploreScreen.route) {
            ExploreScreen(modifier = modifier)

        }

        composable(AppRoutes.SavedScreen.route) {

        }
    }
}