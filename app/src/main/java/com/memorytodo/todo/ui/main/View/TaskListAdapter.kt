package com.memorytodo.todo.ui.main.View

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.memorytodo.todo.R
import com.memorytodo.todo.ui.main.Model.Task
import kotlinx.android.synthetic.main.list_item.view.*

class TaskListAdapter (private val taskList:MutableList<Task>):RecyclerView.Adapter<TaskListAdapter.ViewHolder>(){
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val taskName: TextView = view.findViewById(R.id.taskName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val task = taskList[position]
        holder.taskName.text = task.taskName
    }

    override fun getItemCount() = taskList.size
}