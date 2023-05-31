package com.example.muras.data.local

import android.content.Context

class AppPrefs(context: Context) {

    private val prefs = context.getSharedPreferences(ARGS_PREFS, Context.MODE_PRIVATE)

    var onBoard:Boolean
        get() = prefs.getBoolean(ARGS_ON_BOARD,false)
        set(value) = prefs.edit().putBoolean(ARGS_ON_BOARD,value).apply()

    companion object{
        const val ARGS_PREFS = "prefs"
        const val ARGS_ON_BOARD = "prefs"
    }
}