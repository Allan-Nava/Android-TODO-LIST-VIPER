package com.allannava.todolistviper.BaseTodo

import com.allannava.todolistviper.BaseActivity.BaseContracts
import com.allannava.todolistviper.Models.Todo

/**
 * Created by Allan Nava on 19/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
object BaseTodoContracts {
    //
    interface View :  BaseContracts.View {
    }

    interface Presenter :  BaseContracts.Presenter {
        //
        fun showTodoDetail( todo: Todo)
        //
    }

    interface Interactor :  BaseContracts.Interactor {
        //
        //
    }

    interface InteractorOutput :  BaseContracts.InteractorOutput {
        //
        //
    }
    // serve per le chiamate http
    interface RemoteDataManager :  BaseContracts.Interactor {
        //
        //
    }

    interface RemoteDataManagerOutput :  BaseContracts.InteractorOutput {
        //
        //
    }

    interface Router :  BaseContracts.Router {
        //
        fun showTodoPage(todo : Todo)
        //
    }

    interface NotificationManagerInterface:  BaseContracts.Interactor {
    }

}