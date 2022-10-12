package com.example.daggerstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        findViewById<Button>(R.id.firstButton)?.setOnClickListener {
            startActivity(Intent(this@FirstActivity, SecondActivity::class.java))
        }
        lifecycleScope.launch {
            while (true) {
                delay(4000)
                Log.i("ForLauncherTag", "${this@FirstActivity}")
            }
        }
    }

}