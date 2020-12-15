package com.memorytodo.todo.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.memorytodo.todo.R
import com.memorytodo.todo.ui.main.Model.TestDB
import com.memorytodo.todo.ui.main.View.PlaceholderFragment


class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm) {

    //本番・テストインスタンス切り替え
    private val taskDBInfo = TestDB()
    //DBからtabの数名前(タスク名)取得する処理
    private val taskInfoList = taskDBInfo.taskInfo()
    //タスクの総数
    private val taskNum :Int = taskInfoList.size

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        //DBのTask情報渡す
        return PlaceholderFragment.newInstance(position + 1)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return taskInfoList[position]["taskName"]
    }

    override fun getCount(): Int {
        return taskNum
    }
}