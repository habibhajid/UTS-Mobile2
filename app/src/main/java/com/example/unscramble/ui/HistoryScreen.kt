package com.example.unscramble.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items

@Composable
fun HistoryScreen(gameViewModel: GameViewModel, onBackButtonClicked: () -> Unit){
    val historyList by gameViewModel.historylist.collectAsState()
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .statusBarsPadding()
    ) {
        LazyColumn {
            items(historyList )
            {
                item ->
                Text(
                    text = item.history ?: "",
                    modifier = Modifier.padding(16.dp)
                )
            }

        }
        Button(onClick = onBackButtonClicked) {
           Text("Back")
        }

    }
}