package com.example.homelyapp.HomeHeader

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomAppBar(){
    CenterAlignedTopAppBar(
        actions = {IconButton(onClick = {}) {
            Icon(Icons.Default.ShoppingCart, contentDescription = "Shop")
        }},
        title = {CustomTitle("Homely")
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewCustomAppBar() {
    CustomAppBar()
}