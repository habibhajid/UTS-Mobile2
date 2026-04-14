package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface historyDAO {

    @Query("SELECT * FROM historys")
    suspend fun getAllHistory(): List<historyData>

    @Insert
    suspend fun insert(vararg history: historyData)

}