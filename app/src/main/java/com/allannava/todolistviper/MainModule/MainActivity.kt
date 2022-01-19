package com.allannava.todolistviper.MainModule

import android.os.Bundle
import com.allannava.todolistviper.BaseTodo.BaseTodoActivity
import com.allannava.todolistviper.R

/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 18/01/2022.
 */
class MainActivity : BaseTodoActivity(), MainContracts.View {
    //
    var presenter: MainContracts.Presenter? = MainPresenter(this)
    val TAG     = "MainActivity"
    //

    //region Lifecycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter?.onCreate(intent.extras)
        //
        //
    }

    override fun onResume() {
        super.onResume()
        presenter?.onResume()
    }

    override fun onPause() {
        super.onPause()
        presenter?.onPause()
    }

    override fun onDestroy() {
        presenter?.onDestroy()
        presenter = null
        super.onDestroy()
    }

    // end region

}