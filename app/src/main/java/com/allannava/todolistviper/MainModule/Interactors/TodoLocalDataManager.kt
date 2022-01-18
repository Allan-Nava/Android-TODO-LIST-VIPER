package com.allannava.todolistviper.MainModule.Interactors

import com.allannava.todolistviper.Models.Todo

/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 18/01/2022.
 */
// Singleton class
class TodoLocalDataManager private constructor()  {
    init { println("This ($this) is a singleton") }
    var listTodo : MutableCollection<Todo>? = null
    private val TAG = "UserLocalDataMan"
    private object Holder { val INSTANCE = TodoLocalDataManager() }
    //
    private val TODO_KEY    = "TODO_KEY"
    //
    companion object {
        val instance: TodoLocalDataManager by lazy { Holder.INSTANCE }
    }
    //
}