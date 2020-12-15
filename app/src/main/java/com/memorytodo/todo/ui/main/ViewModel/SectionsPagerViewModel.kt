package com.memorytodo.todo.ui.main.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.memorytodo.todo.ui.main.Model.Task
import com.memorytodo.todo.ui.main.Model.TestDB
import com.memorytodo.todo.ui.main.Model.TestSectionPager

class SectionsPagerViewModel : ViewModel() {
    //本番・テストインスタンス切り替え
    private val taskDBInfo = TestSectionPager()

    //DBからtabの数名前(タスク名)取得する処理
    val taskInfoList = taskDBInfo.taskInfo()
    //タスクの総数
    val taskNum :Int = taskInfoList.size

}