/***
 * Author : Joshua Sinaga
 ***/

package com.jo.buahvit

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_pick_wallpaper.*
import kotlinx.android.synthetic.main.toolbar_main.*

// USING KOTLIN SYNTHETIC
class PickWallpaperActivity : AppCompatActivity() {

    private val wallpapersList  = WallpaperData.getWallpapersList()

    private lateinit var goToMain: Intent

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_wallpaper)

        // getting screen size
        val displayMetrics  = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        val scrHeight   = displayMetrics.heightPixels
        val scrWidth    = displayMetrics.widthPixels

        wallpaperRc.setHasFixedSize(true)
        setSupportActionBar(wallpaperToolbar as Toolbar)
        toolbarTitle.text   = "Tema"

        supportActionBar?.setDisplayShowTitleEnabled(false)
        (wallpaperToolbar as Toolbar).setNavigationIcon(R.drawable.icon_back)

        (wallpaperToolbar as Toolbar).setNavigationOnClickListener {
            goToMain    = Intent(this, MainActivity::class.java)
            finish()
            startActivity(goToMain)
        }

        val toolbarColor    = WallpaperData.getToolbarColor()
        wallpaperToolbar.setBackgroundColor(Color.parseColor(toolbarColor))
        window.statusBarColor   = Color.parseColor(toolbarColor)

        WallpaperData.setWallpaper(wallpaperBackground, scrWidth, scrHeight)

        wallpaperRc.adapter         = WallpaperAdapter(wallpapersList)
        wallpaperRc.layoutManager   = LinearLayoutManager(this)
    }

    override fun onBackPressed() {
        goToMain    = Intent(this, MainActivity::class.java)
        finish()
        startActivity(goToMain)
    }
}
