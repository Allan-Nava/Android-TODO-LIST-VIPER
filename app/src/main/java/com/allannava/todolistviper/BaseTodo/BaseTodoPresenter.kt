package com.allannava.todolistviper.BaseTodo

import android.app.Activity
import android.os.Bundle
import com.allannava.todolistviper.Models.Todo

/**
 * Created by Allan Nava on 19/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
open class BaseTodoPresenter() :  BaseTodoContracts.Presenter, BaseTodoContracts.InteractorOutput{
    //
    private val TAG = "BaseVideoPresenter"
    var baseView:  BaseTodoContracts.View? = null
    var baseInteractor: BaseTodoInteractor = BaseTodoInteractor(this)
    var baseRouter:  BaseTodoContracts.Router? = null
    //

    //region Lifecycle
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        //the view can be a activity or a fragment, that's why this getActivityContext method is needed
        val activity = baseView?.getActivityContext() as? Activity ?: return
        baseRouter =  BaseTodoRouter(activity)
        //Log.i("basePresenter OnCreate", "baseRouter $baseRouter")
        bundle?.let {
            //you can delete this if there's no need to get extras from the intent
        }
    }

    override fun onDestroy() {
        baseView = null
        baseInteractor.unregister()
        //baseInteractor = null
        baseRouter?.unregister()
        baseRouter = null
    }

    //endregion

    //region Presenter

    override fun showTodoDetail(todo: Todo) {
        baseRouter?.showTodoPage(todo)
    }

    // end region

}