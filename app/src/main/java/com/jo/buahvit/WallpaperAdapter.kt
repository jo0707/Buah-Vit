/***
 * Author : Joshua Sinaga
 ***/

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
import kotlinx.android.synthetic.main.wallpaper_list.view.*


class WallpaperAdapter(private val wallList: ArrayList<Wallpaper>): RecyclerView.Adapter<WallpaperAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView = itemView.wallpaperImage
        val itemName: TextView = itemView.wallpaperName
        val itemCardView: CardView = itemView.wallpaperCardView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.wallpaper_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = wallList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentWallpaper = wallList[position]

        with(holder) {
            Glide.with(itemView.context).load(currentWallpaper.imageID)
                .apply(RequestOptions().override(420, 630)).into(itemImage)
            itemName.text = currentWallpaper.name

            itemCardView.setOnClickListener {
                WallpaperData.setWallpaperId(position)
                Toast.makeText(
                    itemView.context,
                    "Wallpaper sudah diatur",
                    Toast.LENGTH_SHORT
                ).show()
                (itemView.context as Activity).recreate()
            }
        }
    }

}