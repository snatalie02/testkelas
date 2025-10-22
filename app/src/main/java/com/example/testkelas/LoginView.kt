package com.example.testkelas

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.testkelas.ui.theme.TestkelasTheme

@Composable
fun LoginView(){
    Column {
        Text(
            text="Halo"
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginViewPreview() {
    TestkelasTheme {
        LoginView()
    }
}