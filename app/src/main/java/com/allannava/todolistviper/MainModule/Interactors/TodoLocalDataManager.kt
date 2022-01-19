package com.allannava.todolistviper.MainModule.Interactors

import androidx.preference.PreferenceManager
import com.allannava.todolistviper.BaseActivity.MyApplication
import com.allannava.todolistviper.MainModule.MainContracts
import com.allannava.todolistviper.Models.Todo
import com.google.gson.Gson

/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
// Singleton class
class TodoLocalDataManager private constructor() : MainContracts.TodoLocalDataManagerInteractor  {
    init { println("This ($this) is a singleton") }
    var listTodo : MutableCollection<Todo>? = mutableSetOf()
    private val TAG = "UserLocalDataMan"
    private object Holder { val INSTANCE = TodoLocalDataManager() }
    //
    private val TODO_KEY    = "TODO_KEY"
    //
    companion object {
        val instance: TodoLocalDataManager by lazy { Holder.INSTANCE }
    }
    // region TodoLocalDataManagerInteractor

    override fun unregister() {}

    override fun saveLocalTodo(todo: Todo) {
        val preferences =  PreferenceManager.getDefaultSharedPreferences( MyApplication.appContext);
        val prefsEditor = preferences.edit()
        val gson = Gson()
        listTodo?.add(todo)
        val json = gson.toJson(listTodo) // myObject - instance of MyObject
        prefsEditor.putString(json, json)
        prefsEditor.apply()
    }

    override fun deleteLocalTodo(todo: Todo) {
        listTodo?.remove(todo)
    }

    override fun cleanAllTodo() {
        listTodo?.clear()
    }

    override fun findAllTodo(): MutableCollection<Todo>? {
        if(listTodo != null){
            return listTodo
        }else{
            return null
        }
    }

    //
}