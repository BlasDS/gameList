package com.blas.gameList

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import com.blas.gameList.data.DataProvider
import com.blas.gameList.*

@ExperimentalCoilApi
@Composable
fun NavigationHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Destinations.gameList.route){
        composable(Destinations.gameList.route) {
            GameList(
                DataProvider.gameList
            ) {
                navController.navigate(Destinations.gameView.route)
                DataProvider.game = it
            }
        }
        composable(Destinations.gameView.route) {
            GameView(
                game = DataProvider.game,
                volver = {
                    navController.navigate(Destinations.gameList.route)
                }
            )
        }
    }
}