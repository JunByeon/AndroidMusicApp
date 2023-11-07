package com.example.androidmusicapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmusicapp.databinding.ListMusicBinding

class MusicAdapter(val musiclist: Array<Music>) : RecyclerView.Adapter<MusicAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ListMusicBinding.inflate(LayoutInflater.from(parent.context))
        return Holder(binding)
    }

    override fun getItemCount() = musiclist.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(musiclist[position])
    }

    class Holder(private val binding: ListMusicBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(musiclist: Music){
            //binding.imageView.setImageResource(R.drawable.곡에 맞는 이미지)
            binding.imageView.setImageResource(R.drawable.sample)
            binding.txtTitle.text = musiclist.title
            binding.txtSinger.text = musiclist.singer
        }

    }

}