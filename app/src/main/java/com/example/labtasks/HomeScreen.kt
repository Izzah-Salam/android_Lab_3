package com.example.labtasks

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

data class CharacterInfo(val imageId: Int, val characterRating: Int, val characterName: String, val characterDescription: String)
val characters = listOf(
    CharacterInfo(R.drawable.chandler, 5,"Chandler", "Chandler Bing, the witty and sarcastic one, is a data analyst known for his self-deprecating humor and awkward jokes.  He often uses sarcasm as a defense mechanism, masking his insecurities with his signature cynical charm"),
    CharacterInfo(R.drawable.joey,4, "Joey", "Joey Tribbiani is a lovable goofball known for his charm, good looks, and...interesting interpretations of life. He's a struggling actor with a big appetite, often relying on his friends for support."),
    CharacterInfo(R.drawable.monica, 4,"Monica", "Monica Geller, from Friends, is a competitive chef with a strong sense of order and cleanliness. She loves cooking, organizing her apartment, and being the center of attention within the friend group."),
    CharacterInfo(R.drawable.phoeba, 5, "Phoeba", "Phoebe Buffay, is a quirky and kind-hearted soul. A talented yet eccentric musician, she brings a unique perspective and infectious optimism to the group, often through her self-written songs and unconventional life experiences."),
    CharacterInfo(R.drawable.rachel, 4,"Rachel", "Rachel Green, is a kind-hearted and fashionable young woman. Initially spoiled and self-centered, she embarks on a journey of self-discovery, pursuing her dream career in fashion while navigating love, friendship, and life's challenges with her close-knit group."),
    CharacterInfo(R.drawable.ross, 4, "Ross", "Ross Geller, is a paleontologist known for his intellectual side, and quirky personality. He often faces humorous situations due to his social awkwardness and struggles with self-discovery.")
)

@Composable
fun HomeScreen(navController: NavHostController) {

    Column {
        Text(
            text = "Friends",
            fontSize = 26.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            textAlign = TextAlign.Center
        )

        Text(
            text = "Click on image to see more detail",
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            color = Color.Gray
        )
    }
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(top = 10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 25.dp)
    ) {
        for (character in characters) {
            item() {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate("Details?name=${character.characterName}")
                        },
                ) {
                    Image(
                        painter = painterResource(id = character.imageId),
                        contentDescription = "Character Image",
                        modifier = Modifier
                            .width(150.dp)
                            .height(100.dp)
                    )
                    Text(
                        text = character.characterName,
                        fontWeight = FontWeight.Black,
                        fontSize = 22.sp,
                        modifier = Modifier.padding(start = 15.dp, top = 10.dp, bottom = 10.dp)
                    )
                }
            }
        }
    }
}
