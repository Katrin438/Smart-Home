package com.example.smarthome.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.smarthome.R
import com.example.smarthome.data.Device
import kotlinx.android.synthetic.main.custom_device_card.view.*
import kotlinx.android.synthetic.main.custom_device_card.*
import kotlinx.android.synthetic.main.custom_device_card.view.*

class DeviceAdapter(val context: Context, val devices: ArrayList<Device>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var mListener : onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.custom_device_card,
                parent,
                false
            ), mListener
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val device = devices.get(position)

        if(holder is ViewHolder){
            holder.tvName.text = device.name
        }
    }

    override fun getItemCount(): Int {
        return devices.size
    }

    class ViewHolder(view: View, listener: onItemClickListener) : RecyclerView.ViewHolder(view) {
        val tvName = view.tvName;

        init {
            view.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }
}