package com.allannava.todolistviper.UXClasses

/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 18/01/2022.
 */

fun String.capitalizeFirstLetter(): String{
    val words = this.split(" ")
    try {
        val sb = StringBuilder()
        if (words[0].length > 0) {
            sb.append(
                Character.toUpperCase(words[0].get(0)) + words[0].subSequence(
                    1,
                    words[0].length
                ).toString().toLowerCase()
            )
            for (i in 1 until words.size) {
                sb.append(" ")
                sb.append(
                    Character.toUpperCase(words[i].get(0)) + words[i].subSequence(
                        1,
                        words[i].length
                    ).toString().toLowerCase()
                )
            }
        }
        return sb.toString()
    }catch (e: Exception) {
        e.printStackTrace()
    }
    return this.trim()
    //words.toString()
}

val String.trimWhitespacesAndNewlines: String
    get() = this.replace("^ | $|\\n ", "")

