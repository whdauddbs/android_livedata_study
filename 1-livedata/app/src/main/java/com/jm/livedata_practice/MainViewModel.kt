package com.jm.livedata_practice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val post : MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    private var count = 1

    fun addValue(){
        post.value = count++.toString()
    }
}