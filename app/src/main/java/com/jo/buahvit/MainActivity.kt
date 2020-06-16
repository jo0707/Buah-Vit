/***
 * Author : Joshua Sinaga
 ***/

package com.jo.buahvit

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar_main.*

// USING KOTLIN SYNTHETIC
class MainActivity : AppCompatActivity() {

    private var fruitList   = FruitData.getFruitsList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting screen size
        val displayMetrics  = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        val scrHeight   = displayMetrics.heightPixels
        val scrWidth    = displayMetrics.widthPixels

        mainRecyclerView.setHasFixedSize(true)

        // setting toolbar
        setSupportActionBar(mainToolbar as Toolbar)
        toolbarTitle.text   = resources.getText(R.string.app_name)

        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.icon_about)

        val toolbarColor    = WallpaperData.getToolbarColor()
        mainToolbar.setBackgroundColor(Color.parseColor(toolbarColor))
        window.statusBarColor   = Color.parseColor(toolbarColor)

        // set background opacity if wallpaper is dark
        WallpaperData.setWallpaper(mainBackground, scrWidth, scrHeight)
        if (WallpaperData.getCurrentPos() == 1)
            mainBackground.alpha    = 1f
        else
            mainBackground.alpha    = 0.75f

        if (WallpaperData.getMainStatus() == 1)
            showRecyclerList()
        else // if 2
            showRecyclerGrid()
    }

    private fun showRecyclerList() {
        WallpaperData.setMainStatus(1)
        mainRecyclerView.adapter        = MainListAdapter(fruitList)
        mainRecyclerView.layoutManager  = LinearLayoutManager(this)
    }

    private fun showRecyclerGrid() {
        WallpaperData.setMainStatus(2)
        mainRecyclerView.adapter        = MainGridAdapter(fruitList)
        mainRecyclerView.layoutManager  = GridLayoutManager(this, 2)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_changeWallpaper -> {
                val pickWallpaper   = Intent(this, PickWallpaperActivity::class.java)
                startActivity(pickWallpaper)
            }
            android.R.id.home   -> {
                val goToAbout   = Intent(this, AboutActivity::class.java)
                startActivity(goToAbout)
            }
            R.id.menu_list      -> showRecyclerList()
            R.id.menu_grid      -> showRecyclerGrid()
        }
        return super.onOptionsItemSelected(item)
    }


}
