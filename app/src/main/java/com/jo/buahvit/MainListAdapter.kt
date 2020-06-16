/***
 * Author : Joshua Sinaga
 ***/

package com.jo.buahvit

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.*
import com.bumptech.glide.request.RequestOptions

class MainListAdapter(private val fruitList: ArrayList<Fruit>): RecyclerView.Adapter<MainListAdapter.ViewHolder>() {

    private val whiteText   = Color.parseColor("#E0E0E0")

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitle: TextView     = itemView.findViewById(R.id.item_title_container)
        val itemShrtDesc: TextView  = itemView.findViewById(R.id.item_shortDesc_container)
        val itemIcon: ImageView     = itemView.findViewById(R.id.item_icon_container)
        val relLayout: RelativeLayout = itemView.findViewById(R.id.item_list_relLayout)
        val itemCardView: CardView  = itemView.findViewById(R.id.item_list_cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = fruitList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentFruit    = fruitList[position]

        Glide.with(holder.itemView.context).
                load(currentFruit.iconID).
                apply(RequestOptions().override(192)).
                into(holder.itemIcon)

        if (WallpaperData.getCurrentPos() == 1) {
            holder.itemIcon.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#AA${currentFruit.rawColor}"))
            holder.relLayout.setBackgroundColor(
                Color.parseColor("#E2${WallpaperData.getToolbarColor().replace("#","")}"))
            holder.itemTitle.setTextColor(whiteText)
            holder.itemShrtDesc.setTextColor(whiteText)
        } else {
            holder.itemIcon.backgroundTintList =
                ColorStateList.valueOf(Color.parseColor("#55${currentFruit.rawColor}"))
            holder.relLayout.setBackgroundColor(Color.parseColor("#4C${currentFruit.rawColor}"))
        }

        holder.itemTitle.text   = currentFruit.name
        holder.itemShrtDesc.text    = currentFruit.fullDesc
        holder.itemCardView.setOnClickListener {
            val goToDetail = Intent(holder.itemView.context, DetailActivity::class.java)
            goToDetail.putExtra("position", position)
            holder.itemView.context.startActivity(goToDetail)
        }

    }

}