package com.example.liststudy

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ResultAdapter(private val dataList: List<Map<String, Any>>, private val context: Context) :
    BaseAdapter() {


    override fun getCount(): Int {
        return dataList.size
    }

    override fun getItem(position: Int): Any {
        return dataList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return convertView?.apply {
            val viewHolder = tag as ViewHolder
            viewHolder.textView?.text = dataList[position]["name"] as String
            viewHolder.imageView?.setImageResource(dataList[position]["image"] as Int)
        } ?: LayoutInflater.from(context)
            .inflate(R.layout.spinner_simple_adapter, null).apply {
                val viewHolder = ViewHolder()
                findViewById<ImageView>(R.id.imageHeader).apply {
                    viewHolder.imageView = this
                }.setImageResource(
                    dataList[position]["image"] as Int
                )
                findViewById<TextView>(R.id.textTailer).apply {
                    viewHolder.textView = this
                }?.text =
                    dataList[position]["name"] as String

                tag = viewHolder
            }

    }

    class ViewHolder() {
        var textView: TextView? = null
        var imageView: ImageView? = null
    }


}