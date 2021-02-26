package com.core.allhere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.core.allhere.simpleTwoWay.MainActivity
import com.core.allhere.databinding.ActivityHomeBinding
import com.core.allhere.sumExample.SumActivity

class HomeActivity : AppCompatActivity() {
    lateinit var homeBinding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  setContentView(R.layout.activity_home)
        homeBinding = DataBindingUtil.setContentView(this,R.layout.activity_home)
        homeBinding.simpleBtn.setOnClickListener({
            val intent  = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })
        homeBinding.sumBtn.setOnClickListener({
            val intent  = Intent(this,SumActivity::class.java)
            startActivity(intent)
        })
    }
}