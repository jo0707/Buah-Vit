/***
 * Author : Joshua Sinaga
 ***/

package com.jo.buahvit

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import androidx.appcompat.widget.Toolbar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.toolbar_main.*

// USING KOTLIN SYNTHETIC
class AboutActivity : AppCompatActivity(), View.OnClickListener {

    private val facebookLink    = "https://www.facebook.com/raraaraaaraaaa/"
    private val instagramLink   = "https://www.instagram.com/com.jooo.ig/"
    private val dicodingLink    = "https://www.dicoding.com/users/799232/"

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // getting screen size
        val displayMetrics  = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        val scrHeight   = displayMetrics.heightPixels
        val scrWidth    = displayMetrics.widthPixels

        // setting toolbar
        setSupportActionBar(toolbarAbout as Toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        (toolbarAbout as Toolbar).setNavigationIcon(R.drawable.icon_back)
        (toolbarAbout as Toolbar).setNavigationOnClickListener {finish()}
        toolbarTitle.text  = "Tentang Saya"

        val toolbarColor    = WallpaperData.getToolbarColor()
        toolbarAbout.setBackgroundColor(Color.parseColor(toolbarColor))
        window.statusBarColor   = Color.parseColor(toolbarColor)

        WallpaperData.setWallpaper(aboutBackground, scrWidth, scrHeight)

        // set about image
        Glide.with(this)
            .load(R.drawable.image_about)
            .apply(RequestOptions().override(512))
            .into(aboutImageView)

        aboutFacebookButton.setOnClickListener(this)
        aboutInstagramButton.setOnClickListener(this)
        aboutDicodingButton.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val openMedia: Intent
        when (v?.id) {
            R.id.aboutFacebookButton -> {
                openMedia   = Intent(Intent.ACTION_VIEW, Uri.parse(facebookLink))
                startActivity(openMedia)
            }
            R.id.aboutInstagramButton -> {
                openMedia   = Intent(Intent.ACTION_VIEW, Uri.parse(instagramLink))
                startActivity(openMedia)
            }
            R.id.aboutDicodingButton -> {
                openMedia   = Intent(Intent.ACTION_VIEW, Uri.parse(dicodingLink))
                startActivity(openMedia)
            }
        }
    }


}
