package com.example.wordkeep.ui.splash.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import com.example.wordkeep.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

        initViews()
    }

    /** Ініціалізація всіх елементів інтерфейсу **/
    private fun initViews() {

    }
}