package com.core.allhere.sumExample

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SumViewModel : ViewModel() {

    private var total = MutableLiveData<Int>()
    val totalData :LiveData<Int>  get() = total


    val inputText = MutableLiveData<String>()

    init {
        total.value =10
    }

    fun setData()
    {
        val inPutData = inputText.value!!.toInt()
        total.value=(total.value)?.plus(inPutData)
    }
}