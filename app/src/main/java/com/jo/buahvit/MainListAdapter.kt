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
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_list.view.*

class MainListAdapter(private val fruitList: ArrayList<Fruit>): RecyclerView.Adapter<MainListAdapter.ViewHolder>() {

    private val whiteText   = Color.parseColor("#E0E0E0")

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitle: TextView = itemView.itemTitleContainer
        val itemShrtDesc: TextView = itemView.itemShortDescContainer
        val itemIcon: ImageView = itemView.itemIconContainer
        val relLayout: RelativeLayout = itemView.itemListRelLayout
        val itemCardView: CardView = itemView.item_list_cardView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = fruitList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentFruit = fruitList[position]

        with(holder) {
            Glide.with(itemView.context).load(currentFruit.iconID)
                .apply(RequestOptions().override(192)).into(itemIcon)

            if (WallpaperData.getCurrentPos() == 1) {
                itemIcon.backgroundTintList =
                    ColorStateList.valueOf(Color.parseColor("#AA${currentFruit.rawColor}"))
                relLayout.setBackgroundColor(
                    Color.parseColor("#E2${WallpaperData.getToolbarColor().replace("#", "")}")
                )
                itemTitle.setTextColor(whiteText)
                itemShrtDesc.setTextColor(whiteText)
            } else {
                itemIcon.backgroundTintList =
                    ColorStateList.valueOf(Color.parseColor("#55${currentFruit.rawColor}"))
                relLayout.setBackgroundColor(Color.parseColor("#4C${currentFruit.rawColor}"))
            }

            itemTitle.text = currentFruit.name
            itemShrtDesc.text = currentFruit.fullDesc
            itemCardView.setOnClickListener {
                val goToDetail = Intent(itemView.context, DetailActivity::class.java)
                goToDetail.putExtra("position", position)
                itemView.context.startActivity(goToDetail)
            }
        }
    }

}