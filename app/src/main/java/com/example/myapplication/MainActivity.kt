package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

   // private lateinit var textMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState != null) {
            AddSenderFragment()
        }

       // textMessage = findViewById(R.id.textView)

        //val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        // viewModel.messageLiveData.observe(this){ message ->
        //textMessage.text = message }

        //findViewById<Button>(R.id.send_button).setOnClickListener {
        //}
    }

    fun AddSenderFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_view, SenderFragment())
            .commit()
    }
}