/***
 * Author : Joshua Sinaga
 ***/

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
import kotlinx.android.synthetic.main.item_grid.view.*

class MainGridAdapter(private val fruitList: ArrayList<Fruit>): RecyclerView.Adapter<MainGridAdapter.GridViewHolder>() {

    private val whiteText   = Color.parseColor("#E0E0E0")

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitle: TextView = itemView.itemTitleGcontainer
        val itemShrtDesc: TextView = itemView.itemShortDescGcontainer
        val itemIcon: ImageView = itemView.itemIconGcontainer
        val linLayout: LinearLayout = itemView.itemGridLinLayout
        val itemCardView: CardView = itemView.item_grid_cardView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_grid, parent, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int = fruitList.size

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val currentFruit = fruitList[position]

        with(holder) {
            Glide.with(itemView.context).load(currentFruit.iconID)
                .apply(RequestOptions().override(264)).into(holder.itemIcon)

            if (WallpaperData.getCurrentPos() == 1) {
                itemIcon.backgroundTintList =
                    ColorStateList.valueOf(Color.parseColor("#AA${currentFruit.rawColor}"))
                linLayout.setBackgroundColor(
                    Color.parseColor("#E2${WallpaperData.getToolbarColor().replace("#", "")}")
                )
                itemTitle.setTextColor(whiteText)
                itemShrtDesc.setTextColor(whiteText)
            } else {
                itemIcon.backgroundTintList =
                    ColorStateList.valueOf(Color.parseColor("#55${currentFruit.rawColor}"))
                linLayout.setBackgroundColor(Color.parseColor("#4C${currentFruit.rawColor}"))
            }

            itemTitle.text = currentFruit.name
            itemShrtDesc.text = currentFruit.fullDesc
            itemCardView.setOnClickListener {
                val goToDetail = Intent(holder.itemView.context, DetailActivity::class.java)
                goToDetail.putExtra("position", position)
                itemView.context.startActivity(goToDetail)
            }
        }
    }

}