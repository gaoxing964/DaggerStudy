package com.example.liststudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class PageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page)
        findViewById<ViewPager>(R.id.viewPagerId).apply {
            adapter = ActivityPagerAdapter(this@PageActivity)
        }
    }
}