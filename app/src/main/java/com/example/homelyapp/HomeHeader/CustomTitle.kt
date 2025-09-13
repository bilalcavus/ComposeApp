package com.example.homelyapp.HomeHeader

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomTitle(text: String, fontWeight: FontWeight){
    Text(modifier = Modifier.padding(10.dp), text = text, fontWeight = fontWeight)
}

@Preview(showBackground = true)
@Composable
fun CustomTitlePreview(){
    CustomTitle(text = "Custom Title", fontWeight = FontWeight.Bold)
}