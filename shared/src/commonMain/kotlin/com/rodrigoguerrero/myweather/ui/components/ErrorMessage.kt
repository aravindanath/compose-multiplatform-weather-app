package com.rodrigoguerrero.myweather.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.rodrigoguerrero.mywheather.MR
import dev.icerock.moko.resources.compose.stringResource

@Composable
fun ErrorMessage(modifier: Modifier = Modifier, onRetry: () -> Unit) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.padding(horizontal = 16.dp),
        ) {
            Text(text = stringResource(MR.strings.error_message))
            Button(onClick = onRetry) {
                Text(text = stringResource(MR.strings.retry))
            }
        }
    }
}
