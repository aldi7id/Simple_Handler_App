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

        val handler = object : Handler(Looper.getMainLooper()) {
            override fun handleMessage(msg: Message) {
                val message = msg.obj as String
                binding.helloWorld.text = message
            }
        }
       binding.btnOke.setOnClickListener{
           Thread(Runnable {
               fun run(){
               val text = binding.helloWorld.setText("Aldi Dwi Ferdian")
               val msg = Message.obtain()
               msg.obj = text
               msg.setTarget(handler)
               msg.sendToTarget()
               }
           }).start()
       }
    }
}