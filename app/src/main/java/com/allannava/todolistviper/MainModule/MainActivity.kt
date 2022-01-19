package com.allannava.todolistviper.MainModule

import android.os.Bundle
import android.util.Log
import com.allannava.todolistviper.BaseTodo.BaseTodoActivity
import com.allannava.todolistviper.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
class MainActivity : BaseTodoActivity(), MainContracts.View {
    //
    var presenter: MainContracts.Presenter? = MainPresenter(this)
    val TAG     = "MainActivity"
    //

    //region Lifecycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate ")
        setContentView(R.layout.activity_main)
        presenter?.onCreate(intent.extras)
        //
        setSupportActionBar(findViewById(R.id.toolbar))
        //
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        //
        presenter?.handleTodoStates()
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