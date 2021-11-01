package com.qqnv.kotlinstudy.util

import android.app.Activity

/**
 * Author: qqnv
 * Date: 2021/11/1 2:14 下午
 * Describe: 管理所有的Activity类
 */
object ActivityCollector {

    private val activities = ArrayList<Activity>()

    fun addActivity(activity: Activity) {
        activities.add(activity)
    }

    fun removeActivity(activity: Activity) {
        activities.remove(activity)
    }

    fun finishAll() {
        for (activity in activities) {
            if (!activity.isFinishing) {
                activity.finish()
            }
        }
        activities.clear()
    }
}