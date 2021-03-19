package com.qin.common.ktx

import android.annotation.SuppressLint
import android.content.Context


private const val notContextError = "Context not obtained"

@SuppressLint("StaticFieldLeak")
internal lateinit var resourceContext: Context

fun getAppContext(): Context {
    if (::resourceContext.isInitialized) return resourceContext else throw (Throwable(
        notContextError
    ))
}