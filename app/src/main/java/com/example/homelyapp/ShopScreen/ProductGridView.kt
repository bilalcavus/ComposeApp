package com.example.homelyapp.ShopScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.homelyapp.R

@Composable
fun ProductGridView(){
    val items = listOf(
        ProductItem(imageRes = R.drawable.sweater, price = 40.99f, title = "Sweater"),
        ProductItem(imageRes = R.drawable.denim_jeans, price = 59.99f, title = "Denim Jeans"),
        ProductItem(imageRes = R.drawable.boots, price = 89.99f, title = "Leather Boots"),
        ProductItem(imageRes = R.drawable.tshirt, price = 19.99f, title = "Cotton T-Shirt"),
        ProductItem(imageRes = R.drawable.scarf, price = 10.99f, title = "Scarf"),
        ProductItem(imageRes = R.drawable.shoes, price = 15.99f, title = "Shoes")
    )
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.height(800.dp),
        userScrollEnabled = false,
        content = {
            items(items) { item ->
                Column() {
                    Box(
                        modifier = Modifier
                            .padding(8.dp)
                            .aspectRatio(1f)
                            .background(
                                color = Color.Gray.copy(alpha = 0.2f),
                                RoundedCornerShape(12.dp)
                            )
                            .clip(RoundedCornerShape(16.dp))
                    ) {
                        Image(
                            painter = painterResource(item.imageRes),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.matchParentSize()
                        )

                    }

                    Text(item.title, modifier = Modifier.padding(horizontal = 12.dp), fontWeight = FontWeight.Bold)
                    Text("$${item.price}", modifier = Modifier.padding(horizontal = 12.dp), color = Color.Blue.copy(alpha = 0.7f), fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(20.dp))
                }
            }
        }
    )
}