package com.example.getmycar

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        setRecyclerViewData()
    }

    private fun setRecyclerViewData() {
        rv_car_types.adapter = CarAdapter()
    }

    fun openCarDetailFragment(view: View) {
        val carType = (view as Button).text
        val intent = CarDetailActivity.getIntent(view).putExtra(CAR_TYPE_EXTRA, carType)
        startActivity(intent)
    }

    companion object {
        const val CAR_TYPE_EXTRA = "CarType"
    }
}
