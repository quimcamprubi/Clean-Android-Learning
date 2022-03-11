package com.cursokotlin.mvvmexample.data.model

import com.google.gson.annotations.SerializedName

data class QuoteModel(
    @SerializedName("nombre") val quote: String,
    @SerializedName("director") val author: String
)