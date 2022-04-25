package com.example.sankalan.activities

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.sankalan.R
import com.example.sankalan.databinding.LoginActivityBinding


class LoginActivity : AppCompatActivity(){


    lateinit var binding: LoginActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = LoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animDrawable = findViewById<ConstraintLayout>(R.id.rootLayout).background as AnimationDrawable?
        animDrawable?.setEnterFadeDuration(10)
        animDrawable?.setExitFadeDuration(3000)
        animDrawable?.start()

    }

}