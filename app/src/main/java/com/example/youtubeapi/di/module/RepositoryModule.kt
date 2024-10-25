package com.example.youtubeapi.di.module

import com.example.youtubeapi.data.repository.Repository
import org.koin.dsl.module

val RepositoryModule = module  {
    factory {
        Repository(get())
    }
}