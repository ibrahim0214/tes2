package com.example.tes_2.model

import androidx.room.Entity

@Entity(tableName = "uang_masuk_table")
class UangMasuk {

    data class UangMasuk(
        @PrimaryKey(autoGenerate = true)
        val id: Int = 0,
        val nominal: Int,
        val keterangan: String
    )

}