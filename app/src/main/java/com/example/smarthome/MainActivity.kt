package com.example.smarthome

import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.utils.ColorTemplate
import androidx.annotation.IntegerRes

class MainActivity : AppCompatActivity() {

        //private lateinit var bitmap: Bitmap
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.statistic_mountly)

//            val image_view = findViewById<ImageView>(R.id.image_view)
//            image_view.isDrawingCacheEnabled = true
//            image_view.buildDrawingCache(true)
//            //on touch listener on image view
//            image_view.setOnTouchListener { v, event ->
//                if (event.action == MotionEvent.ACTION_DOWN || event.action == MotionEvent.ACTION_MOVE)
//                    bitmap = image_view.drawingCache
//                val pixel = bitmap.getPixel(event.x.toInt(), event.y.toInt())
//                //get RGB values from touched pixel
//                val r = Color.red(pixel)
//                val g = Color.green(pixel)
//                val b = Color.blue(pixel)
//
//                //get hex value from touched pixel
//                val hex = "#" + Integer.toHexString(pixel)
//                val color_view = findViewById<ImageView>(R.id.image_view)
//                //set background color to View
//                color_view.setBackgroundColor(Color.rgb(r, g, b))
//                //set Hex and RGB values to text view
//                val result_tv = findViewById<TextView>(R.id.result_tv)
//                result_tv.text = "RGB: $r, $g, $b \nHex: $hex"
//                true
//            }
        }
    }
