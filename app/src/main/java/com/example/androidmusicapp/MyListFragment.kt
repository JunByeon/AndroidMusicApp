package com.example.androidmusicapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmusicapp.databinding.FragmentMylistBinding


class MyListFragment : Fragment() {
    val musiclist = arrayOf(
        Music("Don't Look Back In Anger" , "Oasis"),
        Music("Creep", "RadioHead"),
        Music("My Religion", "Troy Baker"),
        Music("Time is Running out", "Muse"),
        Music("Stand by me", "Oasis"),
        Music("No Surprises", "RadioHead"),
        Music("Don't Matter", "Kings of Leon"),
        Music("When I'm Gonna Lose You", "Local Natives"),
        Music("Crosses", "Jose Gonzalez"),
        Music("Mt.Washington", "Local Natives")
    )// sample List.
    lateinit var binding: FragmentMylistBinding
    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    } onCreate remains for later Update.
    */

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?)
    : View? {
        binding =  FragmentMylistBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recMusic.run{
            adapter = MusicAdapter(musiclist)
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(activity)
        }
    }
}