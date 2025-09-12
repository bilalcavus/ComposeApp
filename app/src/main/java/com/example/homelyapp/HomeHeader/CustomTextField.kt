package com.example.homelyapp.HomeHeader

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomTextField(){
    var search by remember { mutableStateOf("") }
    OutlinedTextField(
        modifier = Modifier.padding(horizontal = 55.dp),
        value = search,
        onValueChange = {search = it},
        label = {Text("Search for products...")},
        shape = OutlinedTextFieldDefaults.shape
    )
}


@Preview(showBackground = true)
@Composable
fun PreviewCustomTextField() {
    CustomTextField()
}