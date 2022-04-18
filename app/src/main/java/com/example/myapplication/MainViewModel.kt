package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val messageMutableLiveData = MutableLiveData(String())

    val messageLiveData: LiveData<String> = messageMutableLiveData
    fun setText(text: String)
    {
        messageMutableLiveData.value = text
    }
}

