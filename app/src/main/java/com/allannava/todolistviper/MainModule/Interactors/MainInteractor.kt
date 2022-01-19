package com.allannava.todolistviper.MainModule.Interactors

import android.content.Context
import com.allannava.todolistviper.MainModule.MainContracts

/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
class MainInteractor(override var context: Context?) : MainContracts.Interactor {

    override fun unregister() {
        //output = null
    }

    override fun findAllTodo() {

    }

}