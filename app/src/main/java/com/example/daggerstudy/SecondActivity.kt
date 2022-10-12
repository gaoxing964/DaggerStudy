package com.example.daggerstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        findViewById<Button>(R.id.secondButton).setOnClickListener {
            startActivity(Intent(this@SecondActivity, FirstActivity::class.java))
        }
        lifecycleScope.launch {
            while (true) {
                delay(4000)
                Log.i("ForLauncherTag", "${this@SecondActivity}")
            }
        }
    }
}