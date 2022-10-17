package com.example.liststudy

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import java.util.zip.Inflater

class ActivityPagerAdapter(private val context: Context) : PagerAdapter() {

    private val images = listOf(
        mapOf("name" to "泽联司机", "image" to R.drawable.zeliansiji),
        mapOf("name" to "拜登", "image" to R.drawable.baiden),
        mapOf("name" to "普京", "image" to R.drawable.pujin)
    )
    private var imagesView = listOf<View>()

    init {
        imagesView = images.map { image ->
            LayoutInflater.from(context).inflate(R.layout.page_item_view, null).apply {
                findViewById<ImageView>(R.id.imageViewId).setImageResource(image["image"] as Int)
                findViewById<TextView>(R.id.nameId).text = image["name"] as String
            }
        }
    }

    override fun getCount(): Int {
        return images.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val imageView = imagesView[position]
        imageView?.run {
            container.addView(this)
        }
        return imageView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        imagesView[position]?.run {
            container.removeView(this)
        }
    }
}