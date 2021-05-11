package com.jm.livedata_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jm.livedata_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var model : MainViewModel
//    private var liveText : MutableLiveData<String> = MutableLiveData()
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        model = ViewModelProvider(this).get(MainViewModel::class.java)
//        liveText.observe(this, {
//            binding.tvNum.text = it
//        })

        model.post.observe(this, {
            post -> binding.tvNum.text = post
        })

        binding.btAdd.setOnClickListener {
            model.addValue()
//            count++
//            liveText.value = count.toString()
        }

        setContentView(binding.root)
    }
}