package com.gastropodinteractive.kotlinmvp.activities.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.gastropodinteractive.kotlinmvp.R
import com.gastropodinteractive.kotlinmvp.base.BaseActivity

class MainActivity : BaseActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
