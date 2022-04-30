package com.example.smarthome.activities

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.smarthome.R


class PhilipsBulb_Activity : AppCompatActivity() {
    private lateinit var bitmap: Bitmap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.philip_bulb)

//        val intArray = resources.getIntArray(R.array.progressGradientColors)
//        arcSeekBar.setProgressGradient(intArray)

        val onoffswith = findViewById<Switch>(R.id.OnOffSwitch);
        val testText = findViewById<TextView>(R.id.test);
        val backBtn = findViewById<ImageView>(R.id.backButton);
        testText.text = "Off";

        onoffswith.setOnCheckedChangeListener { onoffswitch, isChecked ->
            if (isChecked) {
                testText.text = "On"
            } else {
                testText.text = "Off"
            }
        }

        backBtn.setOnClickListener{
            Intent(this, MainActivity::class.java).also{
                startActivity(it)
            }
        }
        //Changing color of lamp starts here
        val image_view = findViewById<ImageView>(R.id.image_view)
        image_view.isDrawingCacheEnabled = true
        image_view.buildDrawingCache(true)
        //on touch listener on image view
        image_view.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_DOWN || event.action == MotionEvent.ACTION_MOVE)
                bitmap = image_view.drawingCache
            val pixel = bitmap.getPixel(event.x.toInt(), event.y.toInt())
            //get RGB values from touched pixel
            val r = Color.red(pixel)
            val g = Color.green(pixel)
            val b = Color.blue(pixel)

            //get hex value from touched pixel
            val hex = "#" + Integer.toHexString(pixel)
            val color_view = findViewById<ImageView>(R.id.image_view)

            //set Hex and RGB values to text view
            val result_tv = findViewById<TextView>(R.id.result_tv)
            //set background color to View
            result_tv.setBackgroundColor(Color.rgb(r, g, b))
            result_tv.text = "RGB: $r, $g, $b \nHex: $hex"
            true
        }

        //val brightnessSeek = findViewById<SeekBar>(R.id.brightnessSeek)
        //val textView2 = findViewById<TextView>(R.id.textView2)
//        brightnessSeek.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
//            override fun onStopTrackingTouch(bar: SeekBar) {
//                val value = bar.progress // the value of the seekBar progress
//            }
//            //adding percentage to the seekbar
//            override fun onStartTrackingTouch(bar: SeekBar) {}
//            override fun onProgressChanged(
//                bar: SeekBar,
//                paramInt: Int, paramBoolean: Boolean
//            ) {
//                textView2.setText("Brightnes: $paramInt%") // here in textView the percent will be shown
//            }
//        })
    }
}