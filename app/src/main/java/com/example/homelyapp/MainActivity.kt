package com.example.homelyapp

import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.homelyapp.BottomMenu.BottomNavbar
import com.example.homelyapp.HomeBody.CustomGridView
import com.example.homelyapp.HomeBody.CustomListView
import com.example.homelyapp.HomeHeader.CustomAppBar
import com.example.homelyapp.HomeHeader.CustomTextField
import com.example.homelyapp.HomeHeader.CustomTitle
import com.example.homelyapp.ShopScreen.ShopBody
import com.example.homelyapp.ui.theme.HomelyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HomelyAppTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavbar(navController = navController) },
        topBar = {
            CustomAppBar()
        },
        modifier = Modifier.fillMaxSize()) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = BottomNavItem.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(BottomNavItem.Home.route) {HomeScreen()}
            composable(BottomNavItem.Shop.route) { ShopBody() }
            composable(BottomNavItem.Add.route) {AddScreen()}
            composable(BottomNavItem.Profile.route) {ProfileScreen()}
        }
    }
}

@Composable
fun HomeScreen(){
        Column(modifier = Modifier.
        fillMaxSize().verticalScroll(rememberScrollState())
        ) {
            CustomTextField()
            Spacer(modifier = Modifier.height(20.dp))
            Row(modifier = Modifier.padding(5.dp),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                Box(modifier = Modifier.background(
                    color = Color.Blue.copy(alpha = 0.5f),
                    shape = RoundedCornerShape(16.dp))) {
                    CustomTitle("Featured", fontWeight = FontWeight.Normal)
                }
                CustomTitle("New Arrivals", fontWeight = FontWeight.Normal)
                CustomTitle("Best Sellers", fontWeight = FontWeight.Normal)
            }
            Spacer(modifier = Modifier.height(20.dp))
            CustomListView()
            Spacer(modifier = Modifier.height(20.dp))
            CustomTitle(text = "Categories", fontWeight = FontWeight.ExtraBold)
            CustomGridView()
        }

}
@Composable
fun ShopScreen(){
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) { Text("Shop") }
}

@Composable
fun AddScreen(){
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) { Text("Add") }
}

@Composable
fun ProfileScreen(){
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) { Text("Profile") }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    HomelyAppTheme {
        MainScreen()
    }
}