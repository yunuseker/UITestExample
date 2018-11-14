package com.younuseker.ui_test_example

import android.support.test.espresso.Espresso
import android.support.test.espresso.ViewAction
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Created by yunuseker on 14.11.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
@RunWith(AndroidJUnit4::class)
class TestMainActivity {

    @Rule
    @JvmField
    val activity = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun editText(){
        Espresso.onView(withId(R.id.et_email))
                .perform(ViewActions.typeText("yunus"))

        Espresso.onView(withId(R.id.et_password))
                .perform(ViewActions.typeText("seker"))

        Espresso.onView(withId(R.id.btn_login))
                .perform(ViewActions.click())
    }
}