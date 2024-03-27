package com.example.labtasks

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.labtasks.ui.theme.LabTasksTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LabTasksTheme {
                Log.e("Life", "onCreate")
                Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()
//                Task2Nav()
                Task3Nav()
            }
        }
    }

    override fun onStart() {
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
        Log.e("Life", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
        Log.e("Life", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
        Log.e("Life", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
        Log.e("Life", "onStop")
        super.onStop()
    }

    override fun onRestart() {
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
        Log.e("Life", "onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
        Log.e(
            "Life", "onDestro" +
                    "y"
        )
        super.onDestroy()
    }
}

