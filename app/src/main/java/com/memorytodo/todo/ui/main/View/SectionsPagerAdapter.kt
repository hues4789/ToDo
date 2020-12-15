package com.memorytodo.todo.ui.main.View

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.memorytodo.todo.R
import com.memorytodo.todo.ui.main.Model.TestDB
import com.memorytodo.todo.ui.main.View.PlaceholderFragment
import com.memorytodo.todo.ui.main.ViewModel.SectionsPagerViewModel


class SectionsPagerAdapter( fm: FragmentManager)
    : FragmentPagerAdapter(fm) {

    private val taskDBInfo = SectionsPagerViewModel()
    //DBからtabの数名前(タスク名)取得する処理
    private val taskInfoList = taskDBInfo.taskInfoList
    //タスクの総数
    private val taskNum :Int = taskDBInfo.taskNum

    override fun getItem(position: Int): Fragment {
        return PlaceholderFragment.newInstance(position + 1)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return taskInfoList[position]["taskName"]
    }

    override fun getCount(): Int {
        return taskNum
    }
}