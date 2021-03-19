package com.qin.common.ktx

import androidx.annotation.StringRes

fun string(@StringRes strId: Int): String {
    return getAppContext().getString(strId)
}