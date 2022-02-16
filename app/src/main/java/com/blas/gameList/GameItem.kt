package com.blas.gameList

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.blas.gameList.data.Game

@ExperimentalCoilApi
@Composable
fun GameItem(
    game: Game,
    click: (Game) -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clickable {
                click(game)
            }
    ) {
        val backgrounColor = MaterialTheme.colors.background
        val onBackground = MaterialTheme.colors.onBackground
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(backgrounColor)
                .padding(vertical = 20.dp, horizontal = 20.dp)
        ) {
            Image(
                painter = rememberImagePainter(data = game.image),
                contentDescription = "Game Photo",
                modifier = Modifier
                    .size(150.dp)
                    //.clip(shape = ) //CircleShape
                    .border(2.dp, onBackground),
                contentScale = ContentScale.Crop,
            )
            Column(
                modifier = Modifier.padding(start = 35.dp)
            ) {
                Text(
                    color = onBackground,
                    text = game.name,
                    style = MaterialTheme.typography.h5
                )
                Text(
                    color = onBackground,
                    text = game.genre,
                    modifier = Modifier.padding(vertical = 15.dp),
                    style = MaterialTheme.typography.h5)
                Text(
                    color = onBackground,
                    text = "Fecha Salida: " + game.year.toString(),
                    style = MaterialTheme.typography.button
                )
            }
        }
    }
}