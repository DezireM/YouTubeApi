package com.example.youtubeapi.data.network.api

import com.example.youtubeapi.data.network.model.BaseResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface YouTubeApiService {
        @GET(/* value = */ "playlists")
        suspend fun getPlaylists(
            @Query("part") part: String,
            @Query("channelId") channelId: String,
            @Query("key") apiKey: String,
            @Query("maxResults") maxResults: Int,
            @Query("pageToken") pageToken: String? = null
        ): BaseResponse

        @GET("playlistItems")
        suspend fun getPlaylistDetails(
            @Query("part") part: String,
            @Query("playlistId") playlistId: String,
            @Query("key") apiKey: String,
            @Query("maxResults") maxResults: Int,
            @Query("pageToken") pageToken: String? = null
        ): BaseResponse
}