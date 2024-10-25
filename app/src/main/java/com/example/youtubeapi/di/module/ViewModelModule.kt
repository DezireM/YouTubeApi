package com.example.youtubeapi.di.module

import com.example.youtubeapi.ui.fragments.playlists.PlaylistViewModel
import com.example.youtubeapi.ui.fragments.playlistsdetail.PlaylistDetailViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val ViewModelModule = module {
    viewModel {
        PlaylistViewModel(get())
    }

    viewModel {
        PlaylistDetailViewModel(get())
    }
}