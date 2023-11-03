package com.example.androidmusicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentA: MainFragment = MainFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, fragmentA).commit();
    }
}