package com.example.quotify.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotify.ui.theme.Bold20
import com.example.quotify.ui.theme.Normal14

@Composable
fun TitleText(
    title: String,
    subTitle: String? = null
) {
    Text(
        text = title,
        style = MaterialTheme.typography.Bold20.copy(fontSize = 30.sp),
        modifier = Modifier.padding(horizontal = 16.dp)
    )

    subTitle?.let { subTitle ->
        Text(
            text = subTitle,
            style = MaterialTheme.typography.Normal14.copy(
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
            ),
            modifier = Modifier.padding(horizontal = 16.dp)
        )
    }
}