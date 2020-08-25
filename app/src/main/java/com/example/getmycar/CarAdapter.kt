package com.example.getmycar

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class CarAdapter : RecyclerView.Adapter<CarAdapter.CarViewHolder>(){

    var carTypes = listOf<String>("Truck", "Sedan", "Motorcycle", "Sports", "Super Car", "Van", "Wagon")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val carTypeButton = LayoutInflater.from(parent.context).inflate(R.layout.item_car_type, parent, false) as Button
        return CarViewHolder(carTypeButton)
    }

    override fun getItemCount(): Int {
        return carTypes.size
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.button.text = carTypes.get(position)
    }

    class CarViewHolder(val button: Button): RecyclerView.ViewHolder(button)
}