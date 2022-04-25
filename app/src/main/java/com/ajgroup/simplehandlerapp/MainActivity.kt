package com.ajgroup.simplehandlerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.view.View
import android.widget.Toast
import com.ajgroup.simplehandlerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var c = Runnable {

            binding.tvView.setText("Im Running Now")
        }

        var hand = Handler()
        hand.postDelayed(c, 1000)
    }
}