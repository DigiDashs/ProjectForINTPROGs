package com.example.sampleapp

import android.app.Activity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class ForgotPasswordActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val proceedButton = findViewById<Button>(R.id.ProceedButton)

        proceedButton.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity2::class.java)
            startActivity(intent)
        }

    }
}
