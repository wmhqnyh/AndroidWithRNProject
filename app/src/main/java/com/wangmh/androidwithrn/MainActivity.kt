package com.wangmh.androidwithrn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        /**
         *  在kotlin中如果在重写Activity的生命周期没有任何信息
         *  会有这个提示RedUndant overriding method(在kotlin  override function上
         *
         *  Kotlin Version：1.2.61
         */

    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
