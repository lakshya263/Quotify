package com.example.quotify.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotify.data.QuotesData
import com.example.quotify.data.quoteList
import com.example.quotify.ui.theme.Bold14
import com.example.quotify.ui.theme.Normal14

@Composable
fun QuoteCard(
    quoteData: QuotesData
) {
    Card(
        modifier = Modifier
            .width(200.dp)
            .height(240.dp),
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = quoteData.colors
                    )
                )
                .padding(20.dp)

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    modifier = Modifier
                        .size(32.dp),
                    shape = CircleShape,
                    color = Color.White.copy(alpha = 0.06f)
                ) {

                }
                SpacerWeight1f()

                Icon(
                    Icons.Default.FavoriteBorder,
                    contentDescription = "ic_favorite",
                    tint = Color.White,
                    modifier = Modifier
                        .clickable(onClick = {})
                )
                Spacer(Modifier.width(5.dp))
                Icon(
                    Icons.Default.Share,
                    contentDescription = "ic_share",
                    tint = Color.White,
                    modifier = Modifier
                        .clickable(onClick = {}
                        )
                )
            }
            SpacerWeight1f()

            Text(
                text = quoteData.quote,
                style = MaterialTheme.typography.Bold14.copy(
                    color = Color.White,
                    lineHeight = 19.sp,
                    textAlign = TextAlign.Left,
                )
            )

            Spacer(Modifier.height(15.dp))

            Text(
                text = quoteData.author,
                style = MaterialTheme.typography.Normal14.copy(
                    color = Color.White,
                    lineHeight = 16.sp,
                    fontStyle = FontStyle.Italic,
                    fontSize = 12.sp
                ),
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuoteCardPreview() {
    QuoteCard(quoteList[0])
}
