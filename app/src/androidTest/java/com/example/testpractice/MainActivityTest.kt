package com.example.testpractice

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent
import androidx.test.espresso.intent.rule.IntentsTestRule
import org.junit.Rule
import org.junit.Test
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.getIntents
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import org.junit.runner.RunWith
import androidx.test.rule.ActivityTestRule
import org.junit.Before


@RunWith(AndroidJUnit4::class)
@MediumTest
class MainActivityTest {


    private lateinit var activityScenario :ActivityScenario<MainActivity>


    @Before
    fun setup() {
        Intents.init()
        activityScenario = launchActivity()
    }


    @Test
    fun onTabFabNavigateToMainActivity2() {
        onView(withId(R.id.floatingActionButton3)).perform(click())
        intended(hasComponent(MainActivity2::class.java.name))
    }

    @Test
    fun fromMainActivity2BackButtonNavigatesToMainActivity() {
        onView(withId(R.id.floatingActionButton3)).perform(click())
        pressBack()
        onView(withId(R.id.floatingActionButton3)).check(matches(isDisplayed()))
//        intended(hasComponent(MainActivity::class.java.name))
    }
}