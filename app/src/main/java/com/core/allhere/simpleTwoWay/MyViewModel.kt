package com.core.allhere.simpleTwoWay

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {


    var edMutableLiveData = MutableLiveData<String>()
  //  var textMutableLiveData = MutableLiveData<String>()

    init {
        edMutableLiveData.value="Demo Data"
    }

    var finalData = MutableLiveData<MyModel>()

    fun getData() : MutableLiveData<MyModel>
    {
        if(finalData!=null)
        {
            finalData  =  MutableLiveData<MyModel>()
        }
        return finalData
    }

    fun onClick()
    {
        var edData = edMutableLiveData.value?.let {
            Log.e("TAG", "onClick: "+it)
        //    textMutableLiveData.value=it
            MyModel(it)
        }
        finalData.value=edData




    }

}