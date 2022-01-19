package com.allannava.todolistviper.BaseTodo

import android.os.Bundle
import android.view.View
import com.allannava.todolistviper.BaseActivity.BaseActivity
import com.allannava.todolistviper.BaseActivity.BaseFragment

/**
 * Created by Allan Nava on 19/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */

abstract class BaseTodoFragment : BaseFragment(), BaseTodoContracts.View {
    var basePresenter:  BaseTodoContracts.Presenter? = null

    // region lifeCycle

    override fun onResume() {
        super.onResume()
        basePresenter?.onResume()
    }

    override fun onPause() {
        basePresenter?.onPause()
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        basePresenter?.onDestroy()
        basePresenter = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        basePresenter?.onCreate()
    }

    // endregion


}
