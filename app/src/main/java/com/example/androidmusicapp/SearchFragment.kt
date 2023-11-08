package com.example.androidmusicapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmusicapp.databinding.FragmentSearchBinding // This should match your fragment's layout

class SearchFragment : Fragment() {
    private val searchlist = arrayOf(
        // Assuming Search is a data class that you have defined elsewhere
        Search("Paris In The Rain"),
        Search("Paris In The Rain"),

        Search("Paris In The Rain"),

        Search("Paris In The Rain"),

        Search("Paris In The Rain"),

        Search("Paris In The Rain"),

        Search("Paris In The Rain"),

        Search("Paris In The Rain")


    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val searchAdapter = SearchAdapter(searchlist)

        val searchRecycler: RecyclerView = view.findViewById(R.id.search_music)

        searchRecycler.adapter = searchAdapter
        searchRecycler.layoutManager = LinearLayoutManager(activity)
        searchRecycler.setHasFixedSize(true)
    }
}
