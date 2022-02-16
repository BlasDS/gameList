package com.blas.gameList

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

@Composable
fun GameLogin(
    loginclick: () -> Unit
) {
    var user by remember{mutableStateOf("")}
    var password by remember{mutableStateOf("")}

    Card(
        elevation = 5.dp,
        modifier = Modifier.fillMaxHeight()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 0.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            ) {
            Image(
                painter = rememberImagePainter(data = "https://github.com/BlasDS/gameList/blob/master/app/src/main/res/logo/GameKOLogo.png?raw=true"),
                contentDescription = "logo",
                modifier = Modifier
                    .fillMaxHeight(0.2f)
                    .fillMaxWidth(0.5f)
                    .padding(5.dp)
            )
            Text("User", style = MaterialTheme.typography.h6)
            TextField(
                value = user,
                onValueChange = {user = it},
                modifier = Modifier
                    .padding(2.dp)
            )
            Text("Password",
                style = MaterialTheme.typography.h6
            )
            TextField(
                value = password,
                onValueChange = {password = it},
            )

            Button(
                modifier = Modifier.padding(25.dp),
                onClick = {
                if (true) {
                    loginclick()
                }
            }) {
                Text(
                    text = "Login",
                    modifier = Modifier
                        .padding(horizontal = 104.dp)
                        .padding(vertical = 7.dp)
                )
            }
            Image(
                painter = rememberImagePainter(data = "https://github.com/BlasDS/gameList/blob/master/app/src/main/res/logo/GamekoNameWhite.png?raw=true"),
                contentDescription = "logo",
                modifier = Modifier
                    .fillMaxHeight(0.2f)
                    .fillMaxWidth(0.5f)
                    .padding(5.dp)
            )
        }
    }
}