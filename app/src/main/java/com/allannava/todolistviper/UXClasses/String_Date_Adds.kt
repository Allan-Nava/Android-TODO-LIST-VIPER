package com.allannava.todolistviper.UXClasses

import android.util.Log
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 18/01/2022.
 */

fun String.getFormattedUTCDate(dt: String) : String{
    return try {
        val parser          =  SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'" )
        parser.timeZone     = TimeZone.getTimeZone("UTC")
        val formatter       = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        //SimpleDateFormat("EEE d MMM, HH:mm" )
        formatter.timeZone = TimeZone.getDefault()
        val formattedDate   = formatter.format( parser.parse(dt ) )
        formattedDate
    }catch (e: java.lang.Exception){
        Log.e("Widget", "e $e")
        //e.printStackTrace()
        dt
    }
}
