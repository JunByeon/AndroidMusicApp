package com.example.androidmusicapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.androidmusicapp.databinding.ListGridBinding

class PlayListAdapter(val albumlist: Array<Music>) : RecyclerView.Adapter<PlayListAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ListGridBinding.inflate(LayoutInflater.from(parent.context))
        return Holder(binding)
    }

    override fun getItemCount() = albumlist.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(albumlist[position])

    }

    class Holder(private val binding: ListGridBinding) : ViewHolder(binding.root){
        fun bind(albumlist : Music){
            binding.run{
                imgAlbumAlbumlist.setImageResource((R.drawable.sample))
                txtAlbumtitle.text = albumlist.title
                txtAlbuminfo.text = albumlist.singer
            }
            binding.root.setOnClickListener{
                it.findNavController().navigate(R.id.action_myPlayListFragment_to_myListFragment)
            }
        }
    }
}