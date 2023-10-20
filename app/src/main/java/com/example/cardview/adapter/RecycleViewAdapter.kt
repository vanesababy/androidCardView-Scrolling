package com.example.cardview.adapter

import android.view.View
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cardview.R


import com.example.cardview.model.RecyclerData


class RecycleViewAdapter
    (private  val context: Context , private val dataset: List<RecyclerData>):
    RecyclerView.Adapter<RecycleViewAdapter.RecyclerViewHolder>(){




    class RecyclerViewHolder (private val view :View): 
    RecyclerView.ViewHolder(view)
    {
          val courseTv: TextView= view.findViewById(R.id.text1)
        val couseIv: ImageView= view.findViewById(R.id.imgv)
        
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerViewHolder {
        val adapterLayout =LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return  RecyclerViewHolder(adapterLayout)
        
    }

    override fun getItemCount(): Int {
      return dataset.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        
        val recyclerData= dataset[position]
        holder.courseTv.text=context.resources.getString(recyclerData.stringResourceId)

        holder.couseIv.setImageResource(recyclerData.imageResourceId)
    }

}