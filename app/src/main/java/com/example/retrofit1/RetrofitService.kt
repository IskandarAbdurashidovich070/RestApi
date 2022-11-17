package com.example.retrofit1

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {

    @GET("plan")
    fun getAllTodo():Call<List<User>>

}