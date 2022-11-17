package com.example.retrofit1

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    const val BASE_URL = "https://hvax.pythonanywhere.com/"


    fun getRetrofit():RetrofitService{
        val build = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
        return build.create(RetrofitService::class.java)
    }

}