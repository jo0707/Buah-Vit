package com.jo.buahvit

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class WallpaperAdapter(private val wallList: ArrayList<Wallpaper>): RecyclerView.Adapter<WallpaperAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView    = itemView.findViewById(R.id.wallpaper_image)
        val itemName: TextView      = itemView.findViewById(R.id.wallpaper_name)
        val itemCardView: CardView  = itemView.findViewById(R.id.wallpaper_cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.wallpaper_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = wallList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentWallpaper    = wallList[position]

        Glide.with(holder.itemView.context).
                load(currentWallpaper.imageID).
                apply(RequestOptions().override(420, 630)).
                into(holder.itemImage)
        holder.itemName.text    = currentWallpaper.name

        holder.itemCardView.setOnClickListener{
            WallpaperData.setWallpaperId(position)
            Toast.makeText(holder.itemView.context, "Wallpaper sudah diatur", Toast.LENGTH_SHORT).show()
            (holder.itemView.context as Activity).recreate()
        }
    }

}