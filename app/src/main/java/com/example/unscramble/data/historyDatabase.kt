package com.example.unscramble.data

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [historyData::class], version = 1)
abstract class historyDatabase: RoomDatabase() {
    abstract fun historyDao(): historyDAO

}