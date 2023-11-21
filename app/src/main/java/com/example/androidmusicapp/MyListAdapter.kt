package com.example.androidmusicapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmusicapp.databinding.ListLinearBinding

class MyListAdapter(val musiclist: Array<Music>) : RecyclerView.Adapter<MyListAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ListLinearBinding.inflate(LayoutInflater.from(parent.context))
        return Holder(binding)
    }

    override fun getItemCount() = musiclist.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(musiclist[position])
    }

    class Holder(private val binding: ListLinearBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(musiclist : Music){
            binding.run{
                imageView.setImageResource((R.drawable.sample))
                txtTitle.text = musiclist.title
                txtSinger.text = musiclist.singer
            }
        }
    }
}