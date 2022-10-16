package com.example.sharepreferencesample

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mDatabaseName = filesDir.path + "/testdbtest.db"
        findViewById<Button>(R.id.sharePreferenceButtonId).setOnClickListener {
            getSharedPreferences("config", Context.MODE_PRIVATE).edit().apply {
                putString("testKey", "testValue")
            }.commit()
        }
        findViewById<Button>(R.id.sqlLiteId).setOnClickListener {
            openOrCreateDatabase(mDatabaseName, Context.MODE_PRIVATE, null).apply {
                Log.i("MainActivity", "$path")
            }
        }
    }
}