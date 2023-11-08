package com.example.androidmusicapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmusicapp.databinding.ListMusicBinding

class SearchAdapter(val searchlist: Array<Search>) : RecyclerView.Adapter<SearchAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ListMusicBinding.inflate(LayoutInflater.from(parent.context))
        return Holder(binding)
    }

    override fun getItemCount() = searchlist.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(searchlist[position])
    }

    class Holder(private val binding: ListMusicBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(searchlist: Search){
            binding.imageView.setImageResource(R.drawable.sample)
            binding.txtTitle.text = searchlist.title
        }

    }

}