package com.example.sampleapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : Activity() {

    // Hardcoded credentials
    private val validUsername = "admin"
    private val validPassword = "password123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val registerButton = findViewById<Button>(R.id.RegisterButton)
        val forgotButton = findViewById<Button>(R.id.ForgotButton)

        val loginButton = findViewById<Button>(R.id.LoginButton)
        val usernameEditText = findViewById<EditText>(R.id.editUsername)
        val passwordEditText = findViewById<EditText>(R.id.editPassword)

        registerButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        forgotButton.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        // Handle login button click
        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Validate login credentials
            if (username == validUsername && password == validPassword) {

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {

                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
