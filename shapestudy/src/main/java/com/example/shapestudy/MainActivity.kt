package com.example.shapestudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.buttonSelectorId).setOnClickListener {
            AlertDialog.Builder(this@MainActivity).apply {
                setTitle("尊敬的用户")
                setMessage("你真的要卸载我吗?")
                setPositiveButton("我在想想") {
                        _, _ ->
                }
                setNegativeButton("残忍卸载") {
                        _, _ ->
                }
            }.create().show()
        }
    }

}