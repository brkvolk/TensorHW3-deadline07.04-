package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            AddSenderFragment()
        }
        Log.i("LifeCycle", "OnCreate")
    }

    fun AddSenderFragment() {
        supportFragmentManager.beginTransaction()
            //.add(R.id.fragment_container_view, SenderFragment())
            .commit()
    }
}