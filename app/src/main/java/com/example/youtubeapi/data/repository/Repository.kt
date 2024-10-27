package com.example.youtubeapi.data.repository

import com.example.youtubeapi.utils.Constants
import com.example.youtubeapi.data.base.BaseRepository
import com.example.youtubeapi.data.network.api.YouTubeApiService
import com.example.youtubeapi.data.network.model.BaseResponse

class Repository(private val apiService: YouTubeApiService) : BaseRepository() {

    fun getPlaylists(pageToken: String? = null) = doRequest {
        apiService.getPlaylists(
            part = Constants.PART,
            channelId = Constants.CHANNEL_ID,
            apiKey = Constants.API_KEY,
            maxResults = Constants.MAX_RESULTS
        )
    }

    fun getPlaylistDetails(playlistId: String, pageToken: String? = null) = doRequest {
        apiService.getPlaylistDetails(
            part = Constants.PART,
            playlistId = playlistId,
            apiKey = Constants.API_KEY,
            maxResults = Constants.MAX_RESULTS,
            pageToken = pageToken
        )
    }
}