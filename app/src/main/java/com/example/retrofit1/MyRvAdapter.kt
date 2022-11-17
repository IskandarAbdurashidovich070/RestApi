package com.example.retrofit1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit1.databinding.RvItemBinding

class MyRvAdapter(var list: List<User>) : RecyclerView.Adapter<MyRvAdapter.Vh>() {

    inner class Vh(var rvItemBinding: RvItemBinding):RecyclerView.ViewHolder(rvItemBinding.root){
        fun onBind(user: User, position: Int ){
            rvItemBinding.name.text = user.sarlavha
            rvItemBinding.text.text = user.matn
            rvItemBinding.date.text = user.oxirgi_muddat
            rvItemBinding.status.text = user.holat
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(RvItemBinding.inflate(LayoutInflater.from(parent.context) , parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size

}