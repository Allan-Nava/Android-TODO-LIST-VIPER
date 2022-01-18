package com.allannava.todolistviper.BaseActivity

import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.res.ColorStateList
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import com.allannava.todolistviper.R

/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 18/01/2022.
 */

interface BaseOnActivityResult {
    fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
}
//
abstract class BaseActivity : AppCompatActivity(), BaseContracts.View {

    var loginCallBack: BaseOnActivityResult? = null
    var dialog: Dialog? = null

    override fun getActivityContext(): Context? {
        return this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        MyApplication.activityResumed()
    }

    override fun onPause() {
        dialog?.dismiss()
        super.onPause()
        MyApplication.activityPaused()
    }

    val mScreenWidth: Int
        get() {
            return getWindowManager()?.getDefaultDisplay()?.getWidth()!!
        }

    val mScreenHeight: Int
        get() {
            return getWindowManager()?.getDefaultDisplay()?.getHeight()!!
        }


    override fun attachBaseContext(newBase: Context?) {
        //super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
        /*try {
            //super.attachBaseContext(newBase!!)
            // fix fonts !!!
            super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase!!))
        } catch (e: Exception) {
            e.printStackTrace()
        }*/
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }

    fun setTopMarginForLayout(layout: View, topMargin: Int?) {
        val layoutParams = layout.layoutParams as ViewGroup.MarginLayoutParams
        layoutParams.topMargin = topMargin!!
        layout.layoutParams = layoutParams
    }

    fun setLateralMarginsForLayout(layout: View, topMargin: Int?) {
        val layoutParams = layout.layoutParams as ViewGroup.MarginLayoutParams
        layoutParams.leftMargin = topMargin!!
        layoutParams.rightMargin = topMargin

        layout.layoutParams = layoutParams
    }

    fun setHeight(layout: FrameLayout, height: Int?) {
        val layoutParams = layout.layoutParams as ViewGroup.MarginLayoutParams
        layoutParams.height = height!!
        layout.layoutParams = layoutParams
    }

    fun dpToPixel(dp: Int): Int {
        val r = resources
        val sizePx =  TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp.toFloat(), r.displayMetrics)
        return sizePx.toInt()
    }

    fun createDialog(string: String): Dialog {
        // Use the Builder class for convenient dialog construction
        val builder = AlertDialog.Builder(this)
        builder.setMessage(string).setPositiveButton(R.string.close) { _, _ -> }
        val colorStateList = ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorPrimary))

        // Create the AlertDialog object and return it
        val alert = builder.create()
        alert.setOnShowListener { _ ->
            val pbutton = alert.getButton(DialogInterface.BUTTON_POSITIVE)
            pbutton.setTextColor(ContextCompat.getColor(this@BaseActivity, R.color.colorPrimary))
            ViewCompat.setBackgroundTintList(pbutton, colorStateList)
        }
        return alert
    }


}