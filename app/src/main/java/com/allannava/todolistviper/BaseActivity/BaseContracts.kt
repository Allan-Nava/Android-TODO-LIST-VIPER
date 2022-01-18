package com.allannava.todolistviper.BaseActivity

import android.app.Activity
import android.content.Context
import android.os.Bundle

/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 18/01/2022.
 */
object BaseContracts {
    //
    interface View {
        fun getActivityContext(): Context?
        fun showErrorDialog(error: String?)
    }

    interface Presenter {
        fun onCreate(bundle: Bundle? = null) {}
        fun onResume() {}
        fun onPause() {}
        fun onDestroy()
    }

    interface Interactor {
        fun unregister()
    }

    interface InteractorOutput //does nothing for now

    interface Router {
        var activity: Activity?
        fun unregister()
    }
    //
}
