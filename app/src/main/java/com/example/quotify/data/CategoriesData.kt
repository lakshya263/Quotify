package com.example.quotify.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoGraph
import androidx.compose.material.icons.filled.Business
import androidx.compose.material.icons.filled.EnergySavingsLeaf
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Handshake
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class CategoriesData(
    val category: String,
    val logo: ImageVector,
    val color: Color
)

val categoryList = listOf<CategoriesData>(
    CategoriesData(
        category = "Love",
        logo = Icons.Filled.Favorite,
        color = Color(0xFFE91E63)
    ),
    CategoriesData(
        category = "Motivation",
        logo = Icons.Filled.Star,
        color = Color(0xFF1D64FC)
    ),
    CategoriesData(
        category = "Success",
        logo = Icons.Filled.AutoGraph,
        color = Color(0xFF00D05A)
    ),
    CategoriesData(
        category = "Wisdom",
        logo = Icons.Filled.Lightbulb,
        color = Color(0xFFEA8200)
    ),

    CategoriesData(
        category = "Friendship",
        logo = Icons.Filled.Handshake,
        color = Color(0xFF5C0BFA)
    ),
    CategoriesData(
        category = "Business",
        logo = Icons.Filled.Business,
        color = Color(0xFFFF3D00)
    ),
    CategoriesData(
        category = "Life",
        logo = Icons.Filled.EnergySavingsLeaf,
        color = Color(0xFF00E676)
    )
)

enum class Category {
    Love,
    Motivation,
    Success,
    Wisdom,
    Friendship,
    Business,
    Life
}