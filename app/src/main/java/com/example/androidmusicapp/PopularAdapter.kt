package com.example.androidmusicapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmusicapp.databinding.ListMusicBinding
import com.example.androidmusicapp.databinding.ListPopularBinding

class PopularAdapter (val popularlist: Array<Chart>) : RecyclerView.Adapter<PopularAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ListPopularBinding.inflate(LayoutInflater.from(parent.context))
        return Holder(binding)
    }

    override fun getItemCount() = (popularlist.size)

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(popularlist[position])
    }

    class Holder(private val binding: ListPopularBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(popularlist : Chart){
            binding.run{
                imgElbum.setImageResource((R.drawable.sample))
                txtTitlePopular.text = popularlist.title
                txtSingerPopular.text = popularlist.singer
                txtRate.text = popularlist.rate
            }
        }
    }
}