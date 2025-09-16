package com.example.homelyapp.ShopScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.homelyapp.HomeBody.CustomGridView

@Composable
fun ShopBody(){
    val shopButtons = listOf<String>(
        "Sort", "Filter", "Price"
    )
    Column(modifier = Modifier.
        fillMaxSize().verticalScroll(rememberScrollState())
    ) {
        LazyRow(contentPadding = PaddingValues(horizontal = 30.dp, vertical = 15.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
            items(shopButtons) { item ->
                Box(modifier = Modifier
                    .height(40.dp)
                    .width(90.dp)
                    .background(color = Color.LightGray.copy(alpha = 0.5f), shape = RoundedCornerShape(16.dp))
                ){
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                        Icon(Icons.Default.ShoppingCart, contentDescription = "Shop Buttons")

                        Text(item)
                    }

                }
            }

        }
        ProductGridView()
    }
}


@Preview(showBackground = true)
@Composable
fun ShopBodyPreview(){
    ShopBody()
}