package com.example.homelyapp.BottomMenu

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun BottomNavbar(){
    var selectedIndex by remember { mutableStateOf(0) }
    NavigationBar {
        NavigationBarItem(
            selected = selectedIndex == 0,
            onClick = {selectedIndex == 0},
            icon = { Icon(
                Icons.Default.Home,
                contentDescription = "Home"
            ) },
            label = {Text("Home")}
        )
        NavigationBarItem(
            selected = selectedIndex == 1,
            onClick = {selectedIndex == 1},
            icon = {Icon(
                Icons.Default.ShoppingCart,
                contentDescription = "Shop"
            )},
            label = {Text("Shop")}
        )
        NavigationBarItem(
            selected = selectedIndex == 2,
            onClick = {selectedIndex == 2},
            icon = {Icon(
                Icons.Default.AddCircle,
                contentDescription = "Add"
            )},
            label = {Text("Add")}
        )
        NavigationBarItem(
            selected = selectedIndex == 3,
            onClick = {selectedIndex == 3},
            icon = {Icon(
                Icons.Default.AccountCircle,
                contentDescription = "Profile"
            )},
            label = {Text("Profile")}
        )

    }
}