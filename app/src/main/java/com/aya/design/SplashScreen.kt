package com.aya.design

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashScreen : AppCompatActivity() {
    val SPLASH_SCREEN_TIMEOUT:Long=3000 //3 sec

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


       Handler().postDelayed({
           startActivity(Intent( this, LoginActivity::class.java ))
           finish()
       },SPLASH_SCREEN_TIMEOUT )

        }

    }
