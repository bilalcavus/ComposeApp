package com.example.homelyapp.HomeBody

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.homelyapp.CategoryItem
import com.example.homelyapp.R

@Composable
fun CustomGridView(){
    val items = listOf(
        CategoryItem(R.drawable.tv_unit),
        CategoryItem(R.drawable.desk_category),
        CategoryItem(R.drawable.mirror),
        CategoryItem(R.drawable.lights),
        CategoryItem(R.drawable.plant),
        CategoryItem(R.drawable.gardrop),
    )
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize(),
        content = {
            items(items) {
                item ->
                Box(modifier = Modifier
                        .padding(8.dp)
                        .aspectRatio(1f)
                        .background(color = Color.Gray.copy(alpha = 0.2f), RoundedCornerShape(12.dp))
                        .clip(RoundedCornerShape(16.dp))
                )
                {
                    Image(
                        painter = painterResource(item.imageRes),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.matchParentSize()
                    )
                }
            }
        }
    )
}


@Preview(showBackground = true)
@Composable
fun CustomGridViewPreview(){
    CustomGridView()
}