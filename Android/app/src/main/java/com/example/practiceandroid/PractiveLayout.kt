package com.example.practiceandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practiceandroid.databinding.ActivityPracticeLayoutBinding

class PractiveLayout : AppCompatActivity() {

    lateinit var binding: ActivityPracticeLayoutBinding
//    lateinit var etName : EditText
//    lateinit var etEmail : EditText
//    lateinit var etPass : EditText
//    lateinit var btnSignUp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPracticeLayoutBinding.inflate(layoutInflater)
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

       binding.btnSignup.setOnClickListener{
            if(binding.etName.text.toString().isEmpty()){
                binding.etName.error = "Enter Name !"
            }
            else if (binding.etEmail.text.toString().isEmpty()){
                binding.etEmail.error = "Enter Email !"
            }
            else if (binding.etPass.text.toString().isEmpty()){
                binding.etPass.error = "Enter Password !"
            }
            else{
                val intent = Intent(this, RelativeActivity::class.java)
                startActivity(intent)
                finish()
                Toast.makeText(this,"Sign Up Successful",Toast.LENGTH_SHORT).show()
            }
        }


    }
}