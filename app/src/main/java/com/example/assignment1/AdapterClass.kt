package com.example.assignment1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(val datalist: List<DataClass>): RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {
    /**
     * This is the initial class I had created, yet the example code chooses a different manner
     * So I am simply going to abandon this.
     */
    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {
        val rvText1:TextView = itemView.findViewById(R.id.tweetTV) //these were different, yet, again, this file is abondanded
        val rvText2 = itemView.findViewById<TextView>(R.id.tweetTV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = datalist[position]
        //holder.rvText1.text = currentItem.name
        //holder.rvText2.text = currentItem.address CHANGED WITH THE DIFFERENCES IN DATA
    }
}