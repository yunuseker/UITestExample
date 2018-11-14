package com.younuseker.ui_test_example

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
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
}