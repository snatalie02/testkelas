package com.example.testkelas

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.testkelas.ui.theme.TestkelasTheme

@Composable
fun Lastpage(){
    Column {
        Text(
            text="week7lab exerciseiyih"
        )

        Text(
            text="hellowwgjyjyjukkuuyyj"
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LastpagePreview() {
    TestkelasTheme {
        Lastpage()
    }
}