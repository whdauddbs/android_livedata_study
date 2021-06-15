package com.jm.databinding_practice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jm.databinding_practice.databinding.ItemTodoBinding
import com.jm.databinding_practice.model.TodoItem

class TodoRecyclerAdapter(private val todoItems : List<TodoItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemTodoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = todoItems[position]
        if (holder is ItemViewHolder) {
            holder.bind(item)
        }
    }

    override fun getItemCount() = todoItems.size

    class ItemViewHolder(private val binding : ItemTodoBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: TodoItem) {
            with(binding) {
                todoItem = item
            }
        }
    }
}