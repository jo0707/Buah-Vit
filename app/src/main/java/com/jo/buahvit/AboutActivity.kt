package com.jo.buahvit

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView

class AboutActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var aboutBackground: ImageView
    private lateinit var aboutCardView: CardView
    private lateinit var aboutImageView: CircleImageView
    private lateinit var toolbarAbout: Toolbar
    private lateinit var toolbarAboutTitle: TextView
    private lateinit var facebookButton: CardView
    private lateinit var instagramButton: CardView
    private lateinit var dicodingButton: CardView

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

        aboutBackground = findViewById(R.id.about_background)
        aboutCardView   = findViewById(R.id.about_cardView)
        aboutImageView  = findViewById(R.id.about_image)
        facebookButton  = findViewById(R.id.about_facebook)
        instagramButton = findViewById(R.id.about_instagram)
        dicodingButton  = findViewById(R.id.about_dicoding)
        toolbarAbout    = findViewById(R.id.about_toolbar)
        toolbarAboutTitle   = findViewById(R.id.toolbar_title)

        // setting toolbar
        setSupportActionBar(toolbarAbout)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        toolbarAbout.setNavigationIcon(R.drawable.icon_back)
        toolbarAbout.setNavigationOnClickListener {finish()}
        toolbarAboutTitle.text  = "Tentang Saya"

        val toolbarColor    = WallpaperData.getToolbarColor()
        toolbarAbout.setBackgroundColor(Color.parseColor(toolbarColor))
        window.statusBarColor   = Color.parseColor(toolbarColor)

        WallpaperData.setWallpaper(aboutBackground, scrWidth, scrHeight)

        // set about image
        Glide.with(this)
            .load(R.drawable.image_about)
            .apply(RequestOptions().override(512))
            .into(aboutImageView)

        facebookButton.setOnClickListener(this)
        instagramButton.setOnClickListener(this)
        dicodingButton.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val openMedia: Intent
        when (v?.id) {
            R.id.about_facebook -> {
                openMedia   = Intent(Intent.ACTION_VIEW, Uri.parse(facebookLink))
                startActivity(openMedia)
            }
            R.id.about_instagram -> {
                openMedia   = Intent(Intent.ACTION_VIEW, Uri.parse(instagramLink))
                startActivity(openMedia)
            }
            R.id.about_dicoding -> {
                openMedia   = Intent(Intent.ACTION_VIEW, Uri.parse(dicodingLink))
                startActivity(openMedia)
            }
        }
    }


}
