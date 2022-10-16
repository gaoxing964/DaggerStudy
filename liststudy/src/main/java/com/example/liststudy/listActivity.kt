package com.example.liststudy

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

val listData = listOf("金星", "水星", "木星", "祸心")
val listDataForSimpleAdapter = listOf(
    mapOf("name" to "地球", "image" to R.drawable.ic_launcher_foreground),
    mapOf("name" to "水星", "image" to R.drawable.ic_launcher_background),
    mapOf("name" to "木星", "image" to R.drawable.ic_launcher_background),
    mapOf("name" to "祸心", "image" to R.drawable.ic_launcher_foreground)
)

class listActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        findViewById<Spinner>(R.id.spinnerId).apply {
            adapter = ArrayAdapter(this@listActivity, R.layout.spinner_item, listData)
            setSelection(2)
        }.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Log.i("onItemSelected", "")
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Log.i("onNothingSelected", "")
            }

        }

        findViewById<Spinner>(R.id.spinnerIdDialog).apply {
            adapter = ArrayAdapter(this@listActivity, R.layout.spinner_item, listData)
            setSelection(2)
        }.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Log.i("onItemSelected", "")
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Log.i("onNothingSelected", "")
            }

        }

        findViewById<Spinner>(R.id.spinnerIdSimpleAdapterId).apply {
            adapter = SimpleAdapter(
                this@listActivity, listDataForSimpleAdapter, R.layout.spinner_simple_adapter,
                arrayOf("name", "image"), intArrayOf(R.id.textTailer, R.id.imageHeader)
            )
        }

        findViewById<Spinner>(R.id.spinnerIdBaseAdapterId).apply {
            adapter = object : BaseAdapter() {
                override fun getCount(): Int {
                  return   listDataForSimpleAdapter.count()
                }

                override fun getItem(position: Int): Any {
                    return listDataForSimpleAdapter[position]
                }

                override fun getItemId(position: Int): Long {
                    return position.toLong()
                }

                override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
                    return LayoutInflater.from(this@listActivity)
                        .inflate(R.layout.spinner_simple_adapter, null).apply {
                            findViewById<ImageView>(R.id.imageHeader).setImageResource(
                                listDataForSimpleAdapter[position]["image"] as Int
                            )
                            findViewById<TextView>(R.id.textTailer).text = listDataForSimpleAdapter[position]["name"] as String

                        }
                }

            }
        }

        findViewById<Spinner>(R.id.spinnerIdConvertView).apply {
            adapter = ResultAdapter(listDataForSimpleAdapter, this@listActivity)
        }


    }
}