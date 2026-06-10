package com.example.quotify.presentation.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotify.data.CategoriesData
import com.example.quotify.presentation.components.TitleText
import com.example.quotify.presentation.components.VerticalSpacer

//@Preview(showBackground = true)
@Composable
fun ExploreScreen(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier =  modifier.fillMaxSize()
    ) {
        item {
            TitleText(
                title = "Categories"
            )

            VerticalSpacer(15.dp)

            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                item {
                    FilterChipItem(
                        text = "Love",
                        selected = true
                    )
                }

                item {
                    FilterChipItem(
                        text = "Motivation",
                        selected = false
                    )
                }

                item {
                    FilterChipItem(
                        text = "Success",
                        selected = false
                    )
                }

                item {
                    FilterChipItem(
                        text = "Wisdom",
                        selected = false
                    )
                }

                item {
                    FilterChipItem(
                        text = "Life",
                        selected = false
                    )
                }
            }
        }
    }
}


@Composable
fun FilterChipItem(
    text: String,
    selected: Boolean
) {
    Surface(
        modifier = Modifier.
            fillMaxSize(),
        onClick = { },
        shape = RoundedCornerShape(14.dp),
        color = if (selected) Color(0xFFDCE2FF) else Color.Transparent,
        border = BorderStroke(
            width = 1.dp,
            color = Color.Gray
        )

    ) {

        Text(
            text = text,
            modifier = Modifier
                .padding(
                    horizontal = 15.dp,
                    vertical = 10.dp
                ),
            fontSize = 18.sp,
            color = Color(0xFF4A4A4A)
        )
    }
}



