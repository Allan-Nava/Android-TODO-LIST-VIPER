package com.allannava.todolistviper.MainModule

import android.app.Activity
import android.os.Bundle
import com.allannava.todolistviper.MainModule.Interactors.MainInteractor

/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
class MainPresenter(var view: MainContracts.View?) : MainContracts.Presenter {
    var interactor: MainContracts.Interactor? = MainInteractor(view?.getActivityContext())
    var router: MainContracts.Router? = null
    private val TAG = "MainPresenter"

    //
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        //the view can be a activity or a fragment, that's why this getActivityContext method is needed
        val activity = view?.getActivityContext() as? Activity ?: return
        router = MainRouter(activity)
        //
        bundle?.let {
            //you can delete this if there's no need to get extras from the intent
        }
    }

    override fun onDestroy() {
        view = null
        interactor?.unregister()
        interactor = null
        router?.unregister()
        router = null
    }

    // end region

    // region Presenter

    override fun handleTodoStates() {

    }
    // end region

}