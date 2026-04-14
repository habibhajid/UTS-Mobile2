package com.example.unscramble.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("historys")
data class historyData(

    val history: String? = null,

    @PrimaryKey
    val id: Int = 0
)
