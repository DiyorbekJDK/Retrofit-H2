package com.example.retrofit_h2.network

import com.example.retrofit_h2.network.model.FoodResponse
import retrofit2.*
import retrofit2.http.*

interface ApiService {


    @GET("/recipes/complexSearch")
    fun getFoods(
        @Query("apiKey") apiKey: String = "4033fe66e0ab4f31b72846fe85317235"
    ): Call<FoodResponse>

    @GET("/recipes/complexSearch")
    fun searchFoods(
        @Query("apiKey") apiKey: String = "4033fe66e0ab4f31b72846fe85317235",
        @Query("query") query: String
    ): Call<FoodResponse>


}