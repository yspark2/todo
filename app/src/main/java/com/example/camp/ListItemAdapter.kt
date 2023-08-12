package com.example.camp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.camp.databinding.RecyclerViewBinding

class ListItemAdapter(private val itemList : List<Items>): RecyclerView.Adapter<ListItemAdapter.MyViewHolder>(){

    class MyViewHolder(private val binding: RecyclerViewBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(items: Items){
            binding.item = items
            binding.executePendingBindings()
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerViewBinding.inflate(inflater, parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ListItemAdapter.MyViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

}
