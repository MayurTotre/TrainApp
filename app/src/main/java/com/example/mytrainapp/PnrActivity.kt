package com.example.mytrainapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytrainapp.databinding.ActivityPnrBinding

class PnrActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPnrBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPnrBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}