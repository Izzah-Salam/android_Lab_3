package com.example.labtasks

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Task3Nav() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Home") {
        composable(route = "Home") {
            HomeScreen(navController)
        }
        composable(
            route = "Details?name={name}&rating={rating}",
            arguments = listOf(
                navArgument(name = "name") {
                    type = NavType.StringType
                    defaultValue = ""
                }
            )
        ) { backstackEntry ->
            backstackEntry.arguments?.getString("name")?.let { name ->
                DetailsScreen(navController, name)
            }
        }

    }
}
