package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var foodList = arrayListOf("Burger", "MC Donalds", "Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDecide.setOnClickListener(){
            val random = java.util.Random()
            val randomFood = random.nextInt(foodList.count())
            txtSelectedFood.text = foodList[randomFood]

        }

        btnAddFood.setOnClickListener(){
            val newFood = txtAddFood.text.toString()
            foodList.add(newFood)
            txtAddFood.text.clear()

        }
    }

}