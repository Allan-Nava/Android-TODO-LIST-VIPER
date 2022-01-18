package com.allannava.todolistviper.BaseActivity

import android.app.Dialog
import android.content.Context
import android.content.ContextWrapper
import androidx.fragment.app.Fragment
import com.allannava.todolistviper.R


/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 18/01/2022.
 */

abstract class BaseFragment : Fragment(),  BaseContracts.View {

    fun getBaseActivity():  BaseActivity? {
        var context = context
        while (context is ContextWrapper) {
            if (context is  BaseActivity) {
                return context
            }
            context = context.baseContext
        }
        return null
    }

    val mScreenWidth: Int
        get() {
            return getBaseActivity()?.getWindowManager()?.getDefaultDisplay()?.getWidth()!!

        }

    val mScreenHeight: Int
        get() {
            return getBaseActivity()?.getWindowManager()?.getDefaultDisplay()?.getHeight()!!
        }

    override fun getActivityContext(): Context? {
        return getBaseActivity()
    }

    override fun showErrorDialog(error: String?) {
        getBaseActivity()?.showErrorDialog(error)
    }

    var statusBarHeight: Int = 0
        get(){
            var result = 0
            val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
            if (resourceId > 0) {
                result = resources.getDimensionPixelSize(resourceId)
            }
            return result
        }
    //
}
