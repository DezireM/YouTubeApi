package com.example.youtubeapi.data.network.model


import com.google.gson.annotations.SerializedName

data class Localized(
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String
)