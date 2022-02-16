package com.blas.gameList

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.blas.gameList.data.Game

@ExperimentalCoilApi
@Composable
fun GameView(
    game: Game,
    volver: () -> Unit
) {
    Card (
        modifier = Modifier.padding(20.dp)
    ) {
        val onBackground = MaterialTheme.colors.onBackground
        LazyColumn(
            modifier = Modifier.fillMaxWidth()
                .padding(all = 10.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(1) {
                Text(text = game.name,
                    style = MaterialTheme.typography.h5,
                    fontWeight = FontWeight.Normal
                )
                Image(
                    painter = rememberImagePainter(data = game.image),
                    contentDescription = "Foto Juego",
                    modifier = Modifier
                        .padding(vertical = 15.dp)
                        .size(300.dp)
                        .border(2.dp, onBackground),

                    contentScale = ContentScale.Crop,
                )
                Text(text = "Description:",
                    style = MaterialTheme.typography.h6,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center
                )
                Text(text = game.description,
                    style = MaterialTheme.typography.subtitle1,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Justify
                )

                Button(onClick = volver,
                    modifier = Modifier.padding(3.dp)
                ) {
                    Text(text = "Back")
                }
            }
        }
    }
}