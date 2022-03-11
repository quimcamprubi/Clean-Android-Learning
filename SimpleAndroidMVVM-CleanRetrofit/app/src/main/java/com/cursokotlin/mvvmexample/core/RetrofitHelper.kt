package com.cursokotlin.mvvmexample.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://621dfd99849220b1fc8bc84b.mockapi.io/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getRetrofitImages(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.thecatapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}