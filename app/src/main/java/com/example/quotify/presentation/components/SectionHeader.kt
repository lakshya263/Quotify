package com.example.quotify.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.quotify.ui.theme.Bold14
import com.example.quotify.ui.theme.Bold16

@Composable
fun SectionHeader(
    firstText: String,
    secondText: String,
    onNavigate: () -> Unit) {
    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = firstText,
            style = MaterialTheme.typography.Bold16,
        )

        Spacer(Modifier.weight(1f))

        Text(
            text = secondText,
            style = MaterialTheme.typography.Bold14.copy(color = Color.Blue.copy(alpha = 0.6f)),
            modifier = Modifier
                .clickable(
                onClick = {
                    onNavigate()
                }
            )
        )
    }
}