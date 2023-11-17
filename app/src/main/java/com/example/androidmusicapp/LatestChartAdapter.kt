package com.example.androidmusicapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmusicapp.databinding.ListLatestBinding

class LatestChartAdapter(val latestChartlist: Array<Music>)
    : RecyclerView.Adapter<LatestChartAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ListLatestBinding.inflate(LayoutInflater.from(parent.context))
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(latestChartlist[position])
    }

    override fun getItemCount() = latestChartlist.size

    class Holder(private val binding: ListLatestBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(latestChartlist : Music){
            binding.run{
                imgMusic.setImageResource(R.drawable.sample)
                txtTitle.text = latestChartlist.title
                txtSinger.text = latestChartlist.singer
            }
        }
    }
}