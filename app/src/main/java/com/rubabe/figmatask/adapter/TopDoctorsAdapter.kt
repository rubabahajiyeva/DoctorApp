package com.rubabe.figmatask.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rubabe.figmatask.SecondActivity
import com.rubabe.figmatask.databinding.DrRecyclerViewItemBinding
import com.rubabe.figmatask.model.TopDoctorsModel

class TopDoctorsAdapter(var mContext: Context, var list: List<TopDoctorsModel>) :
    RecyclerView.Adapter<TopDoctorsAdapter.ViewHolder>() {

    inner class ViewHolder(var binding: DrRecyclerViewItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(DrRecyclerViewItemBinding.inflate(LayoutInflater.from(mContext)))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val doctorItem = list[position]
        holder.binding.drImage.setImageResource(doctorItem.image)
        holder.binding.textView1.text = doctorItem.text1
        holder.binding.heart.text = doctorItem.text2
        holder.binding.textHospital.text = doctorItem.text3
        holder.binding.textView6.text = doctorItem.text6
        holder.binding.button.text = doctorItem.buttonText

        val intent = Intent(holder.binding.root.context,SecondActivity::class.java)
        intent.putExtra("Doctor",list[position])
        holder.binding.button.setOnClickListener {
            holder.binding.root.context.startActivity(intent)
        }
    }
}