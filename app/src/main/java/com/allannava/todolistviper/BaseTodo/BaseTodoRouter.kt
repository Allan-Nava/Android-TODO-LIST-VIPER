package com.allannava.todolistviper.BaseTodo

import android.app.Activity
import com.allannava.todolistviper.Models.Todo

/**
 * Created by Allan Nava on 19/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
open class BaseTodoRouter(override var activity: Activity?)  : BaseTodoContracts.Router {
    //
    override fun unregister() {}
    //
    override fun showTodoPage(todo: Todo) {

    }
    //
}