package com.qin.common.base

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.qin.common.ktx.resourceContext

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        resourceContext = this
    }

    companion object {
        var isDarkTheme by mutableStateOf(false)
    }
}