package com.example.screenadaptertest

import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    override fun getResources(): Resources {
        return PTAdaptUtils(this).adaptWidth(super.getResources(), 411)

    }

//    override fun getResources(): Resources {
//    }
//
//    override fun getResources(): Resources {
//        return AdaptScreenUtils.closeAdapt(super.getResources())
//    }

}