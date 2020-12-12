package com.memorytodo.todo.ui.main.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.memorytodo.todo.ui.main.Model.Task
import com.memorytodo.todo.ui.main.Model.TestDB

class PageViewModel : ViewModel() {

    //本番・テストインスタンス切り替え
    private val taskDBInfo = TestDB()

    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = Transformations.map(_index) {
        "Hello world from section: $it"
    }

    var taskDetailList: MutableList<Task>  = mutableListOf()

    fun setIndex(index: Int) {
        _index.value = index
        //選択されたIDで取得
        taskDetailList = taskDBInfo.taskDetailList(index)
    }




}