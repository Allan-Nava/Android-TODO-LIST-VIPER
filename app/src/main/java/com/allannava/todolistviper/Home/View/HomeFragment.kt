package com.allannava.todolistviper.Home.View

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.allannava.todolistviper.BaseTodo.BaseTodoFragment
import com.allannava.todolistviper.Home.HomeContracts
import com.allannava.todolistviper.Models.Todo
import com.allannava.todolistviper.R
import com.allannava.todolistviper.UXClasses.Layout.Todo.TodoAdapter
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * Created by Allan Nava on 19/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
class HomeFragment : BaseTodoFragment(), HomeContracts.View {
    //
    private val TAG = "HomeFragment"
    var adapter : TodoAdapter? = TodoAdapter()
    //
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
        val todos = mutableListOf(Todo(1, "prova"), Todo(2, "prova2"))
        Log.d(TAG, "todos $todos")
        adapter?.items = todos
        Log.d(TAG, "adapter $adapter")
        recyclerView?.let{
            it.layoutManager = LinearLayoutManager(this.activity,  LinearLayoutManager.VERTICAL, false)
            it.adapter = adapter
        }
        //
    }
    // end region
}