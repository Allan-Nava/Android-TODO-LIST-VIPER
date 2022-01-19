package com.allannava.todolistviper.MainModule

import android.content.Context
import com.allannava.todolistviper.BaseActivity.BaseContracts
import com.allannava.todolistviper.BaseTodo.BaseTodoContracts
import com.allannava.todolistviper.Models.Todo

/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
object MainContracts {

    interface View :  BaseContracts.View {

    }

    interface Presenter :  BaseContracts.Presenter {
        fun handleTodoStates()
    }

    interface Interactor : BaseTodoContracts.Interactor {
        var context: Context?
        fun findAllTodo()
        //
    }

    interface Router : BaseTodoContracts.Router {

    }

    interface TodoLocalDataManagerInteractor :  BaseContracts.Interactor {
        fun saveLocalTodo(todo: Todo)
        fun deleteLocalTodo(todo: Todo)
        fun cleanAllTodo()
        fun findAllTodo(): MutableCollection<Todo>?
    }

}