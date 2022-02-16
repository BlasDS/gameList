package com.blas.gameList

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import com.blas.gameList.data.DataProvider

@ExperimentalCoilApi
@Composable
fun NavigationHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Destinations.GameLogin.route){
        composable(Destinations.GameLogin.route) {
            GameLogin(){
                navController.navigate(Destinations.gameList.route)           }
        }
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