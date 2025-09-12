package com.example.homelyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.homelyapp.HomeBody.CustomListView
import com.example.homelyapp.HomeHeader.CustomAppBar
import com.example.homelyapp.HomeHeader.CustomTextField
import com.example.homelyapp.HomeHeader.CustomTitle
import com.example.homelyapp.ui.theme.HomelyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HomelyAppTheme {

            }
        }
    }
}

@Composable
fun MainScreen(){
    Scaffold(
        topBar = {
            CustomAppBar()
        },
        modifier = Modifier.fillMaxSize()) { innerPadding ->

        Box(modifier = Modifier.padding(innerPadding)){

            Column(modifier = Modifier.
            fillMaxSize(),

            ) {
                CustomTextField()
                Row(horizontalArrangement = Arrangement.SpaceEvenly) {
                    CustomTitle("Featured")
                    CustomTitle("New Arrivals")
                    CustomTitle("Best Sellers")
                }
                CustomListView()
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    HomelyAppTheme {
        MainScreen()
    }
}