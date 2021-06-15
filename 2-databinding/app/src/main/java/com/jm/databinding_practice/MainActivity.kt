package com.jm.databinding_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.jm.databinding_practice.databinding.ActivityMainBinding
import com.jm.databinding_practice.model.TestText
import com.jm.databinding_practice.model.TodoItem

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.testText = TestText("Hello World!")

        val data = listOf(TodoItem(0, "공부하기"), TodoItem(1, "먹기"), TodoItem(2, "놀기"), TodoItem(3, "숨쉬기"))
        binding.rvTodo.adapter = TodoRecyclerAdapter(data)
        binding.rvTodo.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
}