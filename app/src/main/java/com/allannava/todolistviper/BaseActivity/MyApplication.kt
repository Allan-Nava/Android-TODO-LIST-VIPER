package com.allannava.todolistviper.BaseActivity

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 18/01/2022.
 */

class MyApplication : Application() {
    //
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
    //
    override fun onCreate() {
        super.onCreate()
        //
        appContext = applicationContext
    }
    companion object {
        var appContext: Context? = null
            private set

        fun activityResumed() {
            isActivityVisible = true
        }

        fun activityPaused() {
            isActivityVisible = false
        }

        var isActivityVisible: Boolean = false
            private set

        val TAG = "MyApplication"
    }

}