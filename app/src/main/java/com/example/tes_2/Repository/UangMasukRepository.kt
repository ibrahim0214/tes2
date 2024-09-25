package com.example.tes_2.Repository

class UangMasukRepository(private val uangMasukDao: UangMasukDao) {

    val getAllUangMasuk: LiveData<List<UangMasuk>> = uangMasukDao.getAllUangMasuk()

    suspend fun insert(uangMasuk: UangMasuk) {
        uangMasukDao.insert(uangMasuk)
    }

    suspend fun update(uangMasuk: UangMasuk) {
        uangMasukDao.update(uangMasuk)
    }

    suspend fun delete(uangMasuk: UangMasuk) {
        uangMasukDao.delete(uangMasuk)
    }
}
