package com.example.quotify.data

import androidx.compose.ui.graphics.Color

data class QuotesData(
    val quote: String,
    val author: String,
    val colors: List<Color>
)

val quoteList = listOf(

    QuotesData(
        quote = "Love all, trust a few, do wrong to none.",
        author = "— William Shakespeare",
        colors = listOf(
            Color(0xFF232526),
            Color(0xFF1D4350)
        )
    ),

    QuotesData(
        quote = "Where there is love there is life.",
        author = "— Mahatma Gandhi",
        colors = listOf(
            Color(0xFF134E5E),
            Color(0xFF0C6170)
        )
    ),

    QuotesData(
        quote = "The unexamined life is not worth living.",
        author = "— Socrates",
        colors = listOf(
            Color(0xFF4B134F),
            Color(0xFF2C3E50)
        )
    ),

    QuotesData(
        quote = "Knowing yourself is the beginning of all wisdom.",
        author = "— Aristotle",
        colors = listOf(
            Color(0xFF141E30),
            Color(0xFF243B55)
        )
    ),

    QuotesData(
        quote = "It always seems impossible until it's done.",
        author = "— Nelson Mandela",
        colors = listOf(
            Color(0xFF232526),
            Color(0xFF414345)
        )
    ),

    QuotesData(
        quote = "In the middle of difficulty lies opportunity.",
        author = "— Albert Einstein",
        colors = listOf(
            Color(0xFF373B44),
            Color(0xFF4286f4)
        )
    ),

    QuotesData(
        quote = "Friendship is the only cement that will ever hold the world together.",
        author = "— Woodrow Wilson",
        colors = listOf(
            Color(0xFF42275A),
            Color(0xFF734B6D)
        )
    ),

    QuotesData(
        quote = "Stay hungry, stay foolish.",
        author = "— Steve Jobs",
        colors = listOf(
            Color(0xFF4B134F),
            Color(0xFF2C3E50)
        )
    ),

    QuotesData(
        quote = "Life is what happens when you're busy making other plans.",
        author = "— John Lennon",
        colors = listOf(
            Color(0xFF141E30),
            Color(0xFF243B55)
        )
    ),

    QuotesData(
        quote = "Believe you can and you're halfway there.",
        author = "— Theodore Roosevelt",
        colors = listOf(
            Color(0xFF0B486B),
            Color(0xFFF56217)
        )
    ),

    QuotesData(
        quote = "The way to get started is to quit talking and begin doing.",
        author = "— Walt Disney",
        colors = listOf(
            Color(0xFF0F2027),
            Color(0xFF203A43).copy(alpha = 0.6f)
        )
    ),

    QuotesData(
        quote = "A friend to all is a friend to none.",
        author = "— Aristotle",
        colors = listOf(
            Color(0xFF614385),
            Color(0xFF516395)
        )
    ),

    QuotesData(
        quote = "Opportunities don't happen. You create them.",
        author = "— Chris Grosser",
        colors = listOf(
            Color(0xFF3E5151),
            Color(0xFFDECBA4)
        )
    )
)

val trendingQuotes = listOf(

    QuotesData(
        quote = "Discipline is self-love.",
        author = "— Trending Mindset",
        colors = listOf(
            Color(0xFF5C4742),
            Color(0xFF8C6E63)
        )
    ),

    QuotesData(
        quote = "Quiet grind. Loud results.",
        author = "— Hustler Mindset",
        colors = listOf(
            Color(0xFF3B3B58),
            Color(0xFF5C5470)
        )
    ),

    QuotesData(
        quote = "Protect your energy at all costs.",
        author = "— Modern Wisdom",
        colors = listOf(
            Color(0xFF355C57),
            Color(0xFF6C8B74)
        )
    ),

    QuotesData(
        quote = "Main character energy.",
        author = "— Social Era",
        colors = listOf(
            Color(0xFF6B4F4F),
            Color(0xFF8B6F6F)
        )
    ),

    QuotesData(
        quote = "Healing while hustling.",
        author = "— Modern Growth",
        colors = listOf(
            Color(0xFF4E5D6C),
            Color(0xFF768A96)
        )
    ),

    QuotesData(
        quote = "Soft life, serious goals.",
        author = "— Hustle Culture",
        colors = listOf(
            Color(0xFF4B5D67),
            Color(0xFF6B7F8A)
        )
    ),

    QuotesData(
        quote = "Consistency is my cardio.",
        author = "— Self Growth",
        colors = listOf(
            Color(0xFF6A5A4D),
            Color(0xFF9C8772)
        )
    ),

    QuotesData(
        quote = "Romanticizing my growth.",
        author = "— Trending Thoughts",
        colors = listOf(
            Color(0xFF5B4B62),
            Color(0xFF7C6A84)
        )
    )
)

