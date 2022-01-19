package com.allannava.todolistviper.UXClasses.Layout.Todo

import android.os.SystemClock
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.allannava.todolistviper.BaseTodo.BaseTodoContracts
import com.allannava.todolistviper.Models.Todo
import com.allannava.todolistviper.R

/**
 * Created by Allan Nava on 19/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
class TodoAdapter() : RecyclerView.Adapter<TodoAdapter.ViewHolder>() {
    // neeed to fix the presenter stuff
    lateinit var presenter :  BaseTodoContracts.Presenter
    private var mLastClickTime: Long = 0
    var items: Collection<Todo> = mutableListOf()
    private val TAG = "TodoAdapter"
    //
    override fun getItemCount(): Int {
        return items.count()
    }
    //
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.todo_cell, parent, false)
        return ViewHolder(view)
    }
    //
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items.elementAt(position)
        holder.card.layoutWithTodo(item)
        holder.card.setOnClickListener{
            // mis-clicking prevention, using threshold of 1000 ms
            if (SystemClock.elapsedRealtime() - mLastClickTime < 1000){
                return@setOnClickListener
            }
            mLastClickTime = SystemClock.elapsedRealtime()
            //presenter.showTodoDetail(item)
        }
        //
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var card: TodoCell = itemView.findViewById(R.id.todo_cell)
    }
    //

}