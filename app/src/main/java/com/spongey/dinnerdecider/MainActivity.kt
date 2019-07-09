package com.spongey.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

@Suppress("PLUGIN_WARNING")
class MainActivity : AppCompatActivity() {

    private val foodList = arrayListOf("Rice", "Ug../ali", "KFC Streetwise 2", "Fish & Chips")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            foodType.text = foodList[randomFood]
        }
    }
}
