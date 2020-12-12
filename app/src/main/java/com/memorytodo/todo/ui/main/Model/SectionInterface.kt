package com.memorytodo.todo.ui.main.Model

interface SectionInterface {
    fun taskInfo():MutableList<MutableMap<String,String>>
    fun taskDetailList(position :Int):MutableList<Task>

}