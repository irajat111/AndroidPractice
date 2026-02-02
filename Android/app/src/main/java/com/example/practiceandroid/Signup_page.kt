package com.example.practiceandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practiceandroid.databinding.ActivitysignupPageBinding


class Signup_page : AppCompatActivity() {


    // binding declare activity

    lateinit var binding: ActivitysignupPageBinding
//    lateinit var etName : EditText
//    lateinit var etEmail : EditText
//    lateinit var etPass : EditText
//    lateinit var btnSignUp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // initalize activity
        binding = ActivitysignupPageBinding.inflate(layoutInflater)

        // root for activity
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//         etName = findViewById(R.id.etName)
//        etEmail = findViewById(R.id.etEmail)
//        etPass = findViewById(R.id.etPass)
//        btnSignUp = findViewById(R.id.btnSignup)


        // action performed on signup button and also using intent to navigate sign up to login page

        // binding.clickbutton/text.setOnClickListener
        binding.btnSignup.setOnClickListener{

            // validation
            if(binding.etEmail.text.toString().isEmpty()){
                binding.etEmail.error = "Enter Your Email !"
            }
            else if (binding.etPass.text.toString().isEmpty()){
                binding.etPass.error = "Enter Password !"
            }
            else if (binding.etConfirmEmail.text.toString().isEmpty()){
                binding.etConfirmEmail.error = "Confirm Password !"
            }
            else{

                // intent = Intent(this.nextpage/moveanotherpage::class.java
                val intent = Intent(this, Login_Page::class.java)

                // StartActivity here
                startActivity(intent)

                // finish activity
                finish()

                // Toast set here
                Toast.makeText(this,"Sign Up Successful",Toast.LENGTH_SHORT).show()
            }
        }


    }
}