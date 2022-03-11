package com.cursokotlin.mvvmexample.data.model

import com.google.gson.annotations.SerializedName

data class ImageModel(
    @SerializedName("url") val url: String
)