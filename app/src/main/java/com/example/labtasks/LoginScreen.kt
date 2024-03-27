package com.example.labtasks

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun LoginScreen(navController: NavHostController) {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .background(Color(0xFF10b981))
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            modifier = Modifier.width(330.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedPlaceholderColor = Color(0xFF52525b),
                unfocusedPlaceholderColor = Color(0xFF52525b),
                focusedTextColor = Color.Black
            ),
            value = email,
            onValueChange = { email = it },
            placeholder = { Text(text = "Email") }
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            modifier = Modifier.width(330.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                focusedPlaceholderColor = Color(0xFF52525b),
                unfocusedPlaceholderColor = Color(0xFF52525b),
                focusedTextColor = Color.Black
            ),
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(text = "Password") }
        )

        Spacer(modifier = Modifier.height(40.dp))
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(0.dp),
            modifier = Modifier.width(330.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFd1d5db),
                contentColor = Color(0xFF10b981)
            ),
            contentPadding = PaddingValues(vertical = 10.dp),
        ) {
            Text(text = "LOGIN", fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(50.dp))
        Row {
            Text(
                text = "Not a member?",
                modifier = Modifier.offset(y = 14.dp),
                fontSize = 15.sp,
                color = Color.White
            )
            TextButton(onClick = { navController.navigate("Signup") }) {
                Text(text = "Sign up now.", fontSize = 15.sp, color = Color.White)
            }
        }

    }
}