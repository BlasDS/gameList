package com.blas.gameList

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.blas.gameList.data.DataProvider
import com.blas.gameList.ui.theme.gameList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            gameList {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = Color.LightGray,
                    modifier = Modifier.fillMaxSize()
                ) {
                    NavigationHost()
                    }
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Surface(
            color = Color.LightGray,
            modifier = Modifier.fillMaxSize()
        ) {
            GameList(
                DataProvider.gameList,
                click = {

                }
            )
        }
    }
