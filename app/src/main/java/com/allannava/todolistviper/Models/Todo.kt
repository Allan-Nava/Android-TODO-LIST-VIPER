package com.allannava.todolistviper.Models

import java.util.*

/**
 * Created by Allan Nava on 18/01/2022.
 * Updated by Allan Nava on 19/01/2022.
 */
class Todo {
    //
    var id : Int? = null
    var name : String = ""
    var date : Date? = null
    //
    constructor(id: Int, name: String){
        this.id = id
        this.name = name
    }
    //
}