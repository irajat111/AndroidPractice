package com.example.practiceandroid

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practiceandroid.databinding.ActivityLoginPageBinding

class Login_Page : AppCompatActivity() {
    // binding
    lateinit var binding : ActivityLoginPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // BINDING initialization
        binding = ActivityLoginPageBinding.inflate(layoutInflater)

        // root for binding
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //action perform like click actionslistner

        // binding.clickbutton/text.setonclicklistner
        binding.textsignup.setOnClickListener {

            // intent = Intent(this,nextpage/moveanotherpage::class.java
            intent = Intent(this, Signup_page::class.java)

            //startactivity - start activity
            startActivity(intent)

            // finish - activity
            finish()
        }
    }
}