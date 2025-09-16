package com.example.homelyapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val route: String, val icon: ImageVector, val label: String) {
    object Home : BottomNavItem("Home", Icons.Default.Home, "Home")
    object Shop : BottomNavItem("Shop", Icons.Default.ShoppingCart, "Shop")
    object Add : BottomNavItem("Add", Icons.Default.AddCircle, "Add")
    object Profile : BottomNavItem("Profile", Icons.Default.AccountCircle, "Profile")
}

val bottomNavItems =  listOf(
    BottomNavItem.Home,
    BottomNavItem.Shop,
    BottomNavItem.Add,
    BottomNavItem.Profile,

)