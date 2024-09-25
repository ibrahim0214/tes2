package com.example.tes_2.model

import android.app.Application
import androidx.lifecycle.LiveData

class UangMasukViewModel(application: Application) : AndroidViewModel(application) {

        private val repository: UangMasukRepository
        val getAllUangMasuk: LiveData<List<UangMasuk>>

        init {
            val uangMasukDao = UangMasukDatabase.getDatabase(application).uangMasukDao()
            repository = UangMasukRepository(uangMasukDao)
            getAllUangMasuk = repository.getAllUangMasuk
        }

        fun insert(uangMasuk: UangMasuk) {
            viewModelScope.launch(Dispatchers.IO) {
                repository.insert(uangMasuk)
            }
        }

        fun update(uangMasuk: UangMasuk) {
            viewModelScope.launch(Dispatchers.IO) {
                repository.update(uangMasuk)
            }
        }

        fun delete(uangMasuk: UangMasuk) {
            viewModelScope.launch(Dispatchers.IO) {
                repository.delete(uangMasuk)
            }
        }
}