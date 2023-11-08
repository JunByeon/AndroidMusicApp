package com.example.androidmusicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidmusicapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().run{
            replace(binding.fragmentContainerView.id, MyListFragment(/*Value*/))
            replace(binding.fragmentContainerView.id, SearchFragment(/*x*/))
            commit()
        }// R.layout.id.fragmentContainerView와 차이?
    }


}