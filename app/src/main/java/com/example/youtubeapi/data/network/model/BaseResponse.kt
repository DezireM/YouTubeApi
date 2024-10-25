package com.example.youtubeapi.data.network.model


import com.google.gson.annotations.SerializedName

data class BaseResponse(
    @SerializedName("kind")
    val kind: String,
    @SerializedName("tage")
    val tage: String,
    @SerializedName("pageInfo")
    val pageInfo: PageInfo,
    @SerializedName("items")
    val items: List<Item>
)