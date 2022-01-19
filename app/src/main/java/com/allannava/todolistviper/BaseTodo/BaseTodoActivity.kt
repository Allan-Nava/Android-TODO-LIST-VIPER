package com.allannava.todolistviper.BaseTodo

import com.allannava.todolistviper.BaseActivity.BaseActivity

/**
 * Created by Allan Nava on 19/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
abstract class BaseTodoActivity :  BaseActivity(), BaseTodoContracts.View {
    var basePresenter: BaseTodoContracts.Presenter? = null

    // region LifeCycle

    override fun onResume() {
        super.onResume()
        basePresenter?.onResume()
    }

    override fun onPause() {
        super.onPause()
        basePresenter?.onPause()
    }

    override fun onDestroy() {
        basePresenter?.onDestroy()
        basePresenter = null
        super.onDestroy()
    }
    //endregion

    // region View

    // end region

}