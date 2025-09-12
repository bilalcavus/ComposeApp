package com.example.homelyapp.HomeBody

import android.widget.ListView
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomListView(){
    val items = listOf("Living Room Essentials", "Kitchen Essentials", "Bath Essentials")
    LazyRow {
        items(items) {
            item -> Card (modifier = Modifier.fillMaxWidth()
            ){
                Text(text = item, modifier = Modifier.padding(16.dp))
            }
        }
    }
}
