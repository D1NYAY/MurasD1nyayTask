package com.example.muras.presentation.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.muras.databinding.ItemFavoritesBinding
import com.example.muras.domain.module.FavoritesBooks
import com.example.muras.extensions.loadImage

class ProfileAdapter(private val list: ArrayList<FavoritesBooks>, /*private val onBookClick:(Int)-> Unit, private val onFavoritesClick:(FavoritesBooks)->Unit*/):
    RecyclerView.Adapter<ProfileAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
return  ViewHolder(ItemFavoritesBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(private val  binding: ItemFavoritesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind (item:FavoritesBooks){
binding.tvNameBook.text = item.book_title
binding.ivBook.loadImage(item.book.toString())
            //itemView.setOnClickListener{
                //onBookClick(item.id.toInt())
//binding.ivLike.setOnClickListener{
    //onFavoritesClick(item)
//}
            //}
        }
    }
}
