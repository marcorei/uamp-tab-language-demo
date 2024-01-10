package com.example.android.uamp

import android.content.Context
import android.os.Build

const val languageDebugTag = "UAMPDebug"

val Context.language get(): String {
    val locale = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        resources.configuration.locales[0]
    } else {
        resources.configuration.locale
    }
    return locale.language
}
