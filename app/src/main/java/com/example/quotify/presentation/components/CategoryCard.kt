package com.example.quotify.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quotify.data.CategoriesData
import com.example.quotify.data.categoryList
import com.example.quotify.ui.theme.Bold14

//@Preview(showBackground = true)
@Composable
fun CategoryCard(
    cagtegoryData: CategoriesData,
    onClick: () -> Unit = {}
) {
    Card(
        modifier = Modifier
            .width(110.dp)
            .height(120.dp)
            .clickable(onClick = {})
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .background(color = cagtegoryData.color.copy(alpha = 0.06f)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .background(cagtegoryData.color.copy(alpha = 0.2f), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = cagtegoryData.logo,
                    contentDescription = null,
                    modifier = Modifier
                        .size(45.dp)
                        .padding(10.dp),
                    tint = cagtegoryData.color,
                )
            }
            VerticalSpacer(10.dp)

            Text(
                text = cagtegoryData.category,
                style = MaterialTheme.typography.Bold14

            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryCardPreview() {
    CategoryCard(categoryList[0])
}