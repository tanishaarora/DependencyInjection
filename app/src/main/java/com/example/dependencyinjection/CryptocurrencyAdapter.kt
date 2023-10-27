package com.example.dependencyinjection

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide

class CryptocurrencyAdapter(private val cryptocurrency: List<Cryptocurrency>) : RecyclerView.Adapter<CryptocurrencyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CryptocurrencyAdapter.ViewHolder {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.list_item , parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CryptocurrencyAdapter.ViewHolder, position: Int) {
        holder.bind(cryptocurrency[position])
    }

    override fun getItemCount() = cryptocurrency.size

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(index: Cryptocurrency){
            Glide.with(itemView.context)
                .load(index.image).dontAnimate()
                .into(itemView.findViewById(R.id.image))

            itemView.findViewById<TextView>(R.id.cryptocurrency).text = index.name
        }
    }
}