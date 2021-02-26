package com.core.allhere.sumExample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.core.allhere.R
import com.core.allhere.databinding.ActivityMainBinding
import com.core.allhere.databinding.ActivitySumBinding

class SumActivity : AppCompatActivity() {

    lateinit var sumBinding: ActivitySumBinding
    lateinit var sumViewModel: SumViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sumBinding = DataBindingUtil.setContentView(this,R.layout.activity_sum)
        sumViewModel= ViewModelProvider(this).get(SumViewModel::class.java)
        sumBinding.lifecycleOwner=this
        sumBinding.sumModel=sumViewModel



    }
}