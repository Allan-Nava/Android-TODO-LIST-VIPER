package com.allannava.todolistviper.BaseTodo

/**
 * Created by Allan Nava on 19/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */

open class BaseTodoInteractor(open var output:  BaseTodoContracts.InteractorOutput?) :  BaseTodoContracts.Interactor,
    BaseTodoContracts.RemoteDataManagerOutput {
    //
    private val TAG = "BaseVideoInteractor"
    //
    override fun unregister() {
        output = null
    }
    //
    // region Interactor

    // endregion

    // region remoteDataManagerOutput

    // endregion
}