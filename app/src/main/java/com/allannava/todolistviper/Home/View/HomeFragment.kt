package com.allannava.todolistviper.Home.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.allannava.todolistviper.BaseTodo.BaseTodoFragment
import com.allannava.todolistviper.R

/**
 * Created by Allan Nava on 19/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
class HomeFragment : BaseTodoFragment() {

    // region lifeCycle
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
    // end region
}