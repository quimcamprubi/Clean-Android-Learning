package com.cursokotlin.mvvmexample.data.network

import com.cursokotlin.mvvmexample.data.model.ImageModel
import com.cursokotlin.mvvmexample.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface ImageApiClient {
    @GET("v1/images/search")
    suspend fun getAllImages(): Response<List<ImageModel>>
}