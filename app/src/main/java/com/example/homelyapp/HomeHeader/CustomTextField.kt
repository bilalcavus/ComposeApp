package com.example.homelyapp.HomeHeader

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.TextFieldColors


@Composable
fun CustomTextField(){
    var search by remember { mutableStateOf("") }
    OutlinedTextField(
        modifier = Modifier.padding(horizontal = 40.dp),
        value = search,
        onValueChange = {search = it},
        label = {Text("Search for products...")},
        shape = RoundedCornerShape(16.dp),

    )
}


@Preview(showBackground = true)
@Composable
fun PreviewCustomTextField() {
    CustomTextField()
}