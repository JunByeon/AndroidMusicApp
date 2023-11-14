package com.example.androidmusicapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MusicViewModel : ViewModel(){
    private val _sample = MutableLiveData<String>("Sample")
    val sample : LiveData<String> get() = _sample


}