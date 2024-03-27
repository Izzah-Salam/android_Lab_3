package com.example.labtasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.material3.Icon as Icon

@Composable
fun DetailsScreen(navController: NavHostController, name: String) {
    var imgId = 0
    var description = ""
    var rating = 0

    for (character in characters) {
        if (character.characterName == name) {
            imgId = character.imageId
            description = character.characterDescription
            rating = character.characterRating
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp, top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            for (i in 1..5) {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "star",
                    tint = if (i <= rating) Color.Green else Color.White
                )
            }
            Button(onClick = { /*TODO*/ }) {
                
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Image(
            painter = painterResource(id = imgId),
            contentDescription = "Character Image",
            modifier = Modifier
                .width(300.dp)
                .height(300.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = description, fontSize = 17.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
            navController.navigate("Home") {
                popUpTo("Home") {
                    inclusive = true
                }
            }
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            ),
            contentPadding = PaddingValues(vertical=10.dp, horizontal = 30.dp),
        ) {
            Text(text = "Back")
        }
    }
}