package com.younuseker.ui_test_example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.younuseker.ui_test_example.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_login).setOnClickListener({
            Toast.makeText(this,"test success",Toast.LENGTH_LONG).show()
        })
    }
}
