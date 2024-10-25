package com.example.youtubeapi.di.module

import org.koin.core.module.Module
import org.koin.dsl.module

val appModule: Module = module{
    includes(networkModule, ViewModelModule, RepositoryModule)
}