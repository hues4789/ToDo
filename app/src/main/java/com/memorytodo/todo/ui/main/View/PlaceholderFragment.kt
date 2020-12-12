package com.memorytodo.todo.ui.main.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.memorytodo.todo.MainActivity
import com.memorytodo.todo.R
import com.memorytodo.todo.ui.main.Model.Task
import com.memorytodo.todo.ui.main.ViewModel.PageViewModel

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {

    lateinit var taskAdapter: TaskListAdapter
    lateinit var TasklList: MutableList<Task>

    private lateinit var pageViewModel: PageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel::class.java).apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }


    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)
        val textView: TextView = root.findViewById(R.id.section_label)
        pageViewModel.text.observe(viewLifecycleOwner, Observer<String> {
            textView.text = it
        })

        //DBからTask取得
        TasklList = pageViewModel.taskDetailList
        // RecyclerViewの取得
        val recyclerView = root.findViewById<RecyclerView>(R.id.recycler_view)

        // LayoutManagerの設定
        if (recyclerView != null) {
            recyclerView.layoutManager = LinearLayoutManager(activity)
        }

        // CustomAdapterの生成と設定
        taskAdapter = TaskListAdapter(TasklList)
        if (recyclerView != null) {
            recyclerView.adapter = taskAdapter
        }


        return root
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }
}