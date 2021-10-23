package com.example.testpractice

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ResourceCompareTest {

    val resourceCompare = ResourceCompare()

    @Test
    fun inputAppNameReturnsTrue() {
       val context = ApplicationProvider.getApplicationContext<Context>()
       val result = resourceCompare.isEqual(context = context, R.string.app_name, "Test Practice")
        assertThat(result).isTrue()
    }
}