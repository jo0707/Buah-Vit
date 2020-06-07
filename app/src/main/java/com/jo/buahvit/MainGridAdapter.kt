package com.jo.buahvit

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MainGridAdapter(private val fruitList: ArrayList<Fruit>): RecyclerView.Adapter<MainGridAdapter.GridViewHolder>() {

    private val whiteText   = Color.parseColor("#E0E0E0")

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitle: TextView     = itemView.findViewById(R.id.item_title_gcontainer)
        val itemShrtDesc: TextView  = itemView.findViewById(R.id.item_shortDesc_gcontainer)
        val itemIcon: ImageView     = itemView.findViewById(R.id.item_icon_gcontainer)
        val linLayout: LinearLayout = itemView.findViewById(R.id.item_grid_linLayout)
        val itemCardView: CardView  = itemView.findViewById(R.id.item_grid_cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_grid, parent, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int = fruitList.size

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val currentFruit    = fruitList[position]

        Glide.with(holder.itemView.context).
                load(currentFruit.iconID).
                apply(RequestOptions().override(264)).
                into(holder.itemIcon)

        if (WallpaperData.getCurrentPos() == 1) {
            holder.itemIcon.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#AA${currentFruit.rawColor}"))
            holder.linLayout.setBackgroundColor(
                Color.parseColor("#E2${WallpaperData.getToolbarColor().replace("#","")}"))
            holder.itemTitle.setTextColor(whiteText)
            holder.itemShrtDesc.setTextColor(whiteText)
        } else {
            holder.itemIcon.backgroundTintList =
                ColorStateList.valueOf(Color.parseColor("#55${currentFruit.rawColor}"))
            holder.linLayout.setBackgroundColor(Color.parseColor("#4C${currentFruit.rawColor}"))
        }

        holder.itemTitle.text   = currentFruit.name
        holder.itemShrtDesc.text = currentFruit.fullDesc
        holder.itemCardView.setOnClickListener {
            val goToDetail = Intent(holder.itemView.context, DetailActivity::class.java)
            goToDetail.putExtra("position", position)
            holder.itemView.context.startActivity(goToDetail)
        }
    }

}