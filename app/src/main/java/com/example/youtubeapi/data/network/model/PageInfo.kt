package com.example.youtubeapi.data.network.model


import com.google.gson.annotations.SerializedName

data class PageInfo(
    @SerializedName("totalResults")
    val totalResults: Int,
    @SerializedName("resultsPerPage")
    val resultsPerPage: Int
)