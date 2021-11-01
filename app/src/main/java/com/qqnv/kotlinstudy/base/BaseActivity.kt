package com.qqnv.kotlinstudy.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.qqnv.kotlinstudy.util.ActivityCollector

/**
 * Author: qqnv
 * Date: 2021/11/1 2:18 下午
 * Describe: Activity基类
 */
open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityCollector.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityCollector.removeActivity(this)
    }
}