package com.blas.gameList

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import com.blas.gameList.data.Game

@ExperimentalCoilApi
@Composable
fun GameList(
    games: List<Game>,
    click: (Game) -> Unit
) {

    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(games) {
                game -> GameItem(game = game, click)
            }
    }
}