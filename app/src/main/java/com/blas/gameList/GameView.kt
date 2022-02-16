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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.blas.gameList.data.Game


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
                Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean vestibulum scelerisque viverra. Quisque ipsum magna, efficitur quis purus auctor, lobortis dictum elit. Sed pellentesque fringilla facilisis. Morbi nec magna ipsum. Proin tempus eros vehicula ex lacinia condimentum. Vivamus accumsan sit amet dui sed dapibus. Proin quis tristique lorem, vel congue metus. Sed in mi vel elit pharetra dignissim quis in mauris. Ut tempor ipsum sit amet ornare blandit. Ut molestie viverra rhoncus. Vestibulum tristique vel erat quis dignissim. Phasellus a arcu turpis.",
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