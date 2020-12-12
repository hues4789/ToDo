package com.memorytodo.todo.ui.main.Model

data class Task (
    val parentId :Int,
    val taskId :Int,
    val taskName :String,
    val checkStatus : Int
)