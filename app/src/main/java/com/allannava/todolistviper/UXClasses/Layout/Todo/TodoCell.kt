package com.allannava.todolistviper.UXClasses.Layout.Todo

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView
import com.allannava.todolistviper.BaseTodo.BaseTodoPresenter
import com.allannava.todolistviper.Models.Todo
import com.allannava.todolistviper.R

/**
 * Created by Allan Nava on 19/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
class TodoCell : LinearLayout {
    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
    var presenter :  BaseTodoPresenter? = null
    //
    lateinit var title: TextView
    var todo      : Todo? = null
    private val TAG = "TodoCell"
    //
    override fun onFinishInflate() {
        super.onFinishInflate()
        title = findViewById(R.id.title)
    }
    //
    fun layoutWithTodo(todo: Todo){
        this.todo = todo
        title.text = todo.name
    }
    //
}