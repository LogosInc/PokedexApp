package com.example.pokedexapp

import android.app.Application
import timber.log.Timber

class PokedexApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}