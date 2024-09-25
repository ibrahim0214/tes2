package com.example.tes_2.room

import com.example.tes_2.model.UangMasuk

@Database(entities = [UangMasuk::class], version = 1, exportSchema = false)
abstract class UangMasukDatabase : RoomDatabase() {
    abstract fun uangMasukDao(): UangMasukDao

    companion object {
        @Volatile
        private var INSTANCE: UangMasukDatabase? = null

        fun getDatabase(context: Context): UangMasukDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UangMasukDatabase::class.java,
                    "uang_masuk_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
