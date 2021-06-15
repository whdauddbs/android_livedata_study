package com.jm.databinding_practice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jm.databinding_practice.databinding.ItemTodoBinding
import com.jm.databinding_practice.model.TodoItem

class TodoRecyclerAdapterImsi(private val todoItems : List<TodoItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        return ItemViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = todoItems[position]
        if (holder is ItemViewHolder) {
            holder.bind(item)
        }
    }

    override fun getItemCount() = todoItems.size

    class ItemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: TodoItem) {
            val tvTodo = itemView.findViewById<TextView>(R.id.tvTodo)
            tvTodo.text = item.toString()
        }
    }

}