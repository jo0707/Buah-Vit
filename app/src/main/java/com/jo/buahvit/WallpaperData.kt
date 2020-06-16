/***
 * Author : Joshua Sinaga
 ***/

package com.jo.buahvit

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

object WallpaperData {

    private var wallPosition    = 0

    // 1 = list, 2 = grid
    var mainState   = 1

    val name = arrayListOf(
        "Original", "Gelap",
        "Merah", "Biru",
        "Doodle 1", "Doodle 2",
        "Doodle 3", "Doodle 4",
        "Doodle 5"
    )

    private val imageID = arrayListOf(
        R.drawable.main_background,
        R.drawable.wallpaper_dark,
        R.drawable.wallpaper_gradient1,
        R.drawable.wallpaper_gradient2,
        R.drawable.wallpaper_1,
        R.drawable.wallpaper_2,
        R.drawable.wallpaper_3,
        R.drawable.wallpaper_4,
        R.drawable.wallpaper_5
    )

    private val toolbarColor = arrayListOf(
        "#F18D3B",
        "#1A1A1A",
        "#F36E93",
        "#6C96F8",
        "#F18D3B",
        "#F18D3B",
        "#F18D3B",
        "#F18D3B",
        "#5BC843"
    )

    fun getWallpapersList(): ArrayList<Wallpaper> {
        val tempList    = arrayListOf<Wallpaper>()
        for (i in name.indices) {
            tempList.add(
                Wallpaper(
                    name = this.name[i],
                    imageID = this.imageID[i]
                )
            )
        }
        return tempList
    }

    fun setWallpaperId(position: Int) {
        wallPosition = position
    }

    fun setWallpaper(bgView: ImageView, width: Int, height: Int) {
        Glide.with(bgView.context)
            .load(imageID[wallPosition])
            .apply(RequestOptions().override(width, height))
            .centerCrop()
            .into(bgView)
    }

    fun setMainStatus(state: Int) {
        mainState   = state
    }

    fun getToolbarColor(): String = toolbarColor[wallPosition]
    fun getCurrentPos(): Int = wallPosition
    fun getWallpaperId(): Int = imageID[wallPosition]
    fun getMainStatus(): Int = mainState
}