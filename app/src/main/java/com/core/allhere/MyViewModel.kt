package com.core.allhere

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {


    var edMutableLiveData = MutableLiveData<String>()
  //  var textMutableLiveData = MutableLiveData<String>()

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