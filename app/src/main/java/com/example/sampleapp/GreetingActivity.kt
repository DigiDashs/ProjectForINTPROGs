package com.example.sampleapp

import android.app.Activity
import android.os.Bundle

class GreetingActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
    }
}