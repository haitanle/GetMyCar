package com.example.getmycar

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class CarDetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.car_detail_activity)
    }

    override fun onStart() {
        super.onStart()

        setCarTypeToEditTextView()
    }

    private fun setCarTypeToEditTextView() {
        val carType = intent.getStringExtra(MainActivity.CAR_TYPE_EXTRA)
        findViewById<EditText>(R.id.editText_car_type).setText(carType)
    }

    companion object{
        fun getIntent(view: View): Intent{
            return Intent(view.context, CarDetailActivity::class.java)
        }
    }
}