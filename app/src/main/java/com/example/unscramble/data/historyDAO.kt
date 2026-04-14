package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface historyDAO {

    @Query("SELECT * FROM historys")
    fun getAllHistory(): Flow<List<historyData>>

    @Insert
    suspend fun insert(vararg history: historyData)

}