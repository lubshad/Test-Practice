package com.example.testpractice

import android.content.Context

class ResourceCompare {
    fun isEqual(context: Context, resId: Int, input:String) : Boolean {
        return context.getString(resId) == input
    }
}