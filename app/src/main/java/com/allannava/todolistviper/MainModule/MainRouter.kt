package com.allannava.todolistviper.MainModule

import android.app.Activity
import com.allannava.todolistviper.BaseTodo.BaseTodoRouter

/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
class MainRouter(override var activity: Activity?) : BaseTodoRouter(activity), MainContracts.Router {
    //
    private val TAG = "MainRouter"
    //
    override fun unregister() {
        activity = null
    }

    // region Router

    // end region

}
