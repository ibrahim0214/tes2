package com.example.tes_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tes_2.fragment.DaftarUangMasukFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, DaftarUangMasukFragment())
                .commit()
        }
    }
}