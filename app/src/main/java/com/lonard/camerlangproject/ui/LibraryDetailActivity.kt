package com.lonard.camerlangproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lonard.camerlangproject.databinding.ActivityConsultationHistoryBinding
import com.lonard.camerlangproject.databinding.ActivityLibraryDetailBinding

class LibraryDetailActivity : AppCompatActivity() {
    private lateinit var bind: ActivityLibraryDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityLibraryDetailBinding.inflate(layoutInflater)
        setContentView(bind.root)
    }
}