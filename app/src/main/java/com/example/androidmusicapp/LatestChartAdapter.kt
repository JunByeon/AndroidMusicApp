package com.example.androidmusicapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmusicapp.databinding.ListHorizontalBinding

class LatestChartAdapter(val latestChartlist: Array<Music>)
    : RecyclerView.Adapter<LatestChartAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ListHorizontalBinding.inflate(LayoutInflater.from(parent.context))
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(latestChartlist[position])
    }

    override fun getItemCount() = latestChartlist.size

    class Holder(private val binding: ListHorizontalBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(latestChartlist : Music){
            binding.run{
                imgMusic.setImageResource(R.drawable.sample)
                txtTitle.text = latestChartlist.title
                txtSinger.text = latestChartlist.singer
            }
            binding.root.setOnClickListener{
                Toast.makeText(
                    binding.root.context,
                    "${latestChartlist.title} - ${latestChartlist.singer}",
                    Toast.LENGTH_SHORT)
                    .show()
            }
        }

    }
}