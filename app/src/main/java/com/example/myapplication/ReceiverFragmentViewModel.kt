package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReceiverFragmentViewModel: ViewModel() {
    private val messageMutableLiveData = MutableLiveData("")

    val messageLiveData : LiveData<String>
    get() = messageMutableLiveData

}