package com.example.smarthome.activities

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import com.example.smarthome.R
import com.example.smarthome.adapters.DeviceAdapter
import com.example.smarthome.data.Device
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.*
import kotlinx.android.synthetic.main.activity_main_recycle_view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recycle_view)
        //removes shadow from navigation menu
        val bottomnavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        val bulbCard = findViewById<LinearLayout>(R.id.bulbCard);
        val statistics = findViewById<ImageView>(R.id.imageViewStatistics);
        val home = findViewById<ImageView>(R.id.imageViewhome);
        val addDeviceBtn = findViewById<FloatingActionButton>(R.id.fab)

        val deviceCard = findViewById<CardView>(R.id.deviceCard)

        recyler_view_devices.layoutManager = GridLayoutManager(this, 2)

        val devicesAdapter = DeviceAdapter(this, getItemsList())
        recyler_view_devices.adapter = devicesAdapter

        devicesAdapter.setOnItemClickListener(object : DeviceAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                Intent(this@MainActivity, PhilipsBulb_Activity::class.java).also{
                    startActivity(it)
                }
            }
        })

        home.setOnClickListener{
            Intent(this, MainActivity::class.java).also{
                startActivity(it)
            }
        }
        statistics.setOnClickListener{
            Intent(this, Statistic::class.java).also{
                startActivity(it)
            }
        }

        addDeviceBtn.setOnClickListener{
            Intent(this, AddDeviceActivity::class.java).also{
                startActivity(it)
            }
        }
    }
    private fun getItemsList(): ArrayList<Device> {
        val list = ArrayList<Device>()

        list.add(Device("DeviceName", "123ABC", "Description"))
        list.add(Device("DeviceName2", "222ABC", "Description2"))
        list.add(Device("DeviceName3", "333ABC", "Description3"))

        return list
    }
}