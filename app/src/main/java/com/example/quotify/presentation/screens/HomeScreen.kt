package com.example.quotify.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.quotify.data.categoryList
import com.example.quotify.data.quoteList
import com.example.quotify.data.trendingQuotes
import com.example.quotify.presentation.components.CategoryCard
import com.example.quotify.presentation.components.QuoteCard
import com.example.quotify.presentation.components.SectionHeader
import com.example.quotify.presentation.components.TitleText
import com.example.quotify.presentation.components.VerticalSpacer

//@Preview(showBackground = true)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onNavigateToExplore: () -> Unit) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
    ) {
        item {
            TitleText(
                title = "Explore",
                subTitle = "Awesome quotes from our community"
            )
        }

        item {
            VerticalSpacer()
        }

        item {
            Box(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth()
                    .fillMaxHeight(0.25f)
                    .clip(RoundedCornerShape(12.dp)),
                contentAlignment = Alignment.Center,
            ) {
                AsyncImage(
                    model = "https://i.pinimg.com/736x/1a/fd/3f/1afd3f3fd73871816c92cf7cdbbd449f.jpg",
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.FillWidth,
                )
            }
        }

        item {
            VerticalSpacer()
        }

        // Section Header
        item {
            SectionHeader(
//                modifier = Modifier
//                    .padding(horizontal = 16.dp),
                firstText = "Latest Quotes",
                secondText = "View All",
                onNavigate = {
                    onNavigateToExplore()
                }
            )
        }

        item {
            VerticalSpacer()
        }

        // Quote Card
        item {
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(quoteList) {
                    QuoteCard(it)
                }
            }
        }

        item {
            VerticalSpacer()
        }

        // Section Header
        item {
            SectionHeader(
                firstText = "Categories",
                secondText = "View All",
                onNavigate = {})
        }

        item {
            VerticalSpacer()
        }

        // Category Card
        item {
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(categoryList) {
                    CategoryCard(it)
                }
            }
        }

        item {
            VerticalSpacer()
        }

        item {
            SectionHeader(
                firstText = "Trending Quotes",
                secondText = "View All",
                onNavigate = {}
            )
        }

        item {
            VerticalSpacer()
        }

        item {
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(trendingQuotes) {
                    QuoteCard(it)
                }
            }
        }

        item {
            VerticalSpacer(15.dp)
        }
    }
}









