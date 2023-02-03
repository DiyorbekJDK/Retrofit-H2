package com.example.retrofit_h2.network.model

import com.google.gson.annotations.SerializedName

data class FoodResponse(
    val foodList: List<Food>
)
data class Food(
    @SerializedName("id")
    val foodId: Int,
    val title: String,
    val image: String
)
