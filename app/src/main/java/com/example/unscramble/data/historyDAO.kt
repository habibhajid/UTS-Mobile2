package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Query

@Dao
interface historyDAO {

    @Query("SELECT * FROM historys")
    suspend fun getAllHistory(): List<historyData>

}