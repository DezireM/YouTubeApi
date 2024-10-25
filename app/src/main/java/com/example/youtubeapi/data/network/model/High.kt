package com.example.youtubeapi.data.network.model

import com.google.gson.annotations.SerializedName


data class High(
    @SerializedName("url")
    val url: String,
    @SerializedName("width")
    val width: Int,
    @SerializedName("height")
    val height: Int
)