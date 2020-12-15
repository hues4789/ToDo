package com.memorytodo.todo.ui.main.Model

class TestDB :SectionInterface{
    override fun taskDetailList(position :Int) :MutableList<Task>{
        val taskDetailList :MutableList<Task> = mutableListOf()
        taskDetailList.add(Task(0,0,"掃除",0))
        taskDetailList.add(Task(0,1,"洗濯",0))
        taskDetailList.add(Task(0,2,"ゴミ出し",0))
        taskDetailList.add(Task(0,3,"家事",0))
        taskDetailList.add(Task(0,4,"家事",0))

        return taskDetailList
    }
}