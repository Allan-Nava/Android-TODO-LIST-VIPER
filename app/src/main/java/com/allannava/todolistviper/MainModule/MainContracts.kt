package com.allannava.todolistviper.MainModule

import com.allannava.todolistviper.BaseActivity.BaseContracts
import com.allannava.todolistviper.Models.Todo

/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
object MainContracts {

    interface View :  BaseContracts.View {

    }



    interface TodoLocalDataManagerInteractor :  BaseContracts.Interactor {
        fun saveLocalTodo(todo: Todo)
        fun deleteLocalTodo(todo: Todo)
        fun cleanAllTodo()
        fun findAllTodo(): MutableCollection<Todo>?
    }

}