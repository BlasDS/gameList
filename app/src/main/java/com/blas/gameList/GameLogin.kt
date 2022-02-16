package com.blas.gameList

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

@Composable
fun GameLogin(
    loginclick: () -> Unit
) {
    var user by remember{mutableStateOf("")}
    var password by remember{mutableStateOf("")}

    Card(elevation = 5.dp) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            ) {
            Text("User", style = MaterialTheme.typography.h6)
            TextField(value = user, onValueChange = {user = it})
            Text("Password", style = MaterialTheme.typography.h6)
            TextField(value = password, onValueChange = {password = it})

            Button(onClick = {
                if ( user.equals("blas") && password.equals("blas2020")){
                    loginclick()
                }
            }) {
                Text(text = "Login")
            }
            
            Image(painter = rememberImagePainter(data = "https://github.com/BlasDS/gameList/blob/master/app/src/main/res/logo/GameKOLogo.png?raw=true"), contentDescription = "logo")
        }
    }
}