package com.example.practiceandroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PractiveLayout : AppCompatActivity() {
    lateinit var etName : EditText
    lateinit var etEmail : EditText
    lateinit var etPass : EditText
    lateinit var btnSignUp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practice_layout)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
         etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etPass = findViewById(R.id.etPass)
        btnSignUp = findViewById(R.id.btnSignup)

        btnSignUp.setOnClickListener{
            if(etName.text.toString().isEmpty()){
                etName.error = "Enter Name !"
            }
            else if (etEmail.text.toString().isEmpty()){
                etEmail.error = "Enter Email !"
            }
            else if (etPass.text.toString().isEmpty()){
                etPass.error = "Enter Password !"
            }
            else{
                Toast.makeText(this,"Sign Up Successful",Toast.LENGTH_SHORT).show()
            }
        }


    }
}