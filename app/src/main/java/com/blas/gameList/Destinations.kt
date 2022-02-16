package com.blas.gameList

sealed class Destinations (
    val route: String
        ) {
    object GameLogin: Destinations ("GameLogin")
    object gameList: Destinations("gameList")
    object gameView: Destinations("gameView")
}