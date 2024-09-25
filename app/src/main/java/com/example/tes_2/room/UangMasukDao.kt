package com.example.tes_2.room

import androidx.room.vo.Dao

@Dao
interface UangMasukDao {
        @Insert(onConflict = OnConflictStrategy.IGNORE)
        suspend fun insert(uangMasuk: UangMasuk)

        @Query("SELECT * FROM uang_masuk_table ORDER BY id ASC")
        fun getAllUangMasuk(): LiveData<List<UangMasuk>>

        @Update
        suspend fun update(uangMasuk: UangMasuk)

        @Delete
        suspend fun delete(uangMasuk: UangMasuk)
}

