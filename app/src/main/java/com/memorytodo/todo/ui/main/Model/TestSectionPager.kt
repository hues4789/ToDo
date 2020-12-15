package com.memorytodo.todo.ui.main.Model

class TestSectionPager :SectionPagerInterface{

    override fun taskInfo() :MutableList<MutableMap<String,String>>{
        val taskInfo :MutableList<MutableMap<String,String>> = mutableListOf()
        taskInfo.add(mutableMapOf("taskName" to "家事"))
        taskInfo.add(mutableMapOf("taskName" to "買い物"))
        taskInfo.add(mutableMapOf("taskName" to "勉強"))
        taskInfo.add(mutableMapOf("taskName" to "仕事"))
        taskInfo.add(mutableMapOf("taskName" to "遊び"))

        return taskInfo
    }
}