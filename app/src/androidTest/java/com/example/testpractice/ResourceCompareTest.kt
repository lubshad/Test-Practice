package com.example.testpractice

import android.content.Context
import android.util.Log
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceCompareTest {

    private  lateinit var resourceCompare: ResourceCompare

    @Before
    fun setup() {
        resourceCompare = ResourceCompare()
    }

    @After
    fun tearDown() {
        Log.i("TearDown", "Cleared")
    }

    @Test
    fun inputAppNameReturnsTrue() {
       val context = ApplicationProvider.getApplicationContext<Context>()
       val result = resourceCompare.isEqual(context = context, R.string.app_name, "Test Practice")
        assertThat(result).isTrue()
    }

    @Test
    fun inputRandomNameReturnsFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context = context, R.string.app_name, "Random Name")
        assertThat(result).isFalse()
    }
}