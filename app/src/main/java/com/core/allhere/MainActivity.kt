package com.core.allhere

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.core.allhere.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding
    lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        activityMainBinding.lifecycleOwner=this
        myViewModel=ViewModelProvider(this).get(MyViewModel::class.java)
        myViewModel.getData().observe(this,{
            it.name
        })
        activityMainBinding.myModel=myViewModel



    }
}