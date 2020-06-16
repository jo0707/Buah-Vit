/***
 * Author : Joshua Sinaga
 ***/

package com.jo.buahvit

import android.annotation.SuppressLint
import android.app.SearchManager
import android.content.Intent
import android.graphics.Color
import android.graphics.Paint
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.*
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.toolbar_main.*

// USING KOTLIN SYNTHETIC
class DetailActivity : AppCompatActivity(), View.OnClickListener {

    private val textWhite   = Color.parseColor("#E0E0E0")
    private lateinit var fruit: Fruit

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        // set window flags
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

        fruit           = FruitData.getFruitX(intent.getIntExtra("position", 0))

        // setting toolbar
        setSupportActionBar(toolbarDetail as Toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        (toolbarDetail as Toolbar).setNavigationIcon(R.drawable.icon_back)
        (toolbarDetail as Toolbar).setNavigationOnClickListener {finish()}
        toolbarTitle.text    = "Detail"

        Glide.with(toolbarDetail.context).
            load(fruit.imageID).
            apply(RequestOptions().override(1200, 800)).
            into(detailImage)

        // matching color if wallpaper is dark
        if (WallpaperData.getCurrentPos() == 1) {
            detailRootLayout.setBackgroundResource(WallpaperData.getWallpaperId())
            detailCardView.setCardBackgroundColor(Color.parseColor(
                "#88${WallpaperData.getToolbarColor().replace("#","")}"))
            detailTitle.setTextColor(textWhite)
            detailImageHint.setTextColor(textWhite)
            detailDesc.setTextColor(textWhite)
            detailWiki.setTextColor(Color.BLACK)
            detailGoogle.setTextColor(Color.BLACK)
            setToolbarColor(WallpaperData.getToolbarColor())
        } else {
            detailRootLayout.setBackgroundColor(Color.parseColor("#1d${fruit.rawColor}"))
            detailCardView.setCardBackgroundColor(Color.parseColor("#2a${fruit.rawColor}"))
            setToolbarColor()
        }

        detailTitle.text  = fruit.name
        detailImageHint.text  = "Gambar dari buah ${fruit.name}"
        detailDesc.text = fruit.fullDesc
        detailWiki.text = "Lihat buah ${fruit.name} di Wikipedia (ilmiah)"
        detailGoogle.text   = "Cari buah ${fruit.name} di Google"
        detailWiki.paintFlags   = Paint.UNDERLINE_TEXT_FLAG
        detailGoogle.paintFlags = Paint.UNDERLINE_TEXT_FLAG
        detailWiki.setOnClickListener(this)
        detailGoogle.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.detailWiki -> {
                val wikiIntent  = Intent(Intent.ACTION_VIEW, Uri.parse(fruit.wikiLink))
                startActivity(wikiIntent)
            }
            R.id.detailGoogle -> {
                val googleIntent = Intent(Intent.ACTION_WEB_SEARCH)
                googleIntent.putExtra(SearchManager.QUERY, "buah ${fruit.name}")
                startActivity(googleIntent)
            }
        }
    }

    private fun setToolbarColor(color: String? = null) {
        if (color != null) {
            toolbarDetail.setBackgroundColor(Color.parseColor(color))
            window.statusBarColor = Color.parseColor(color)
        }
        else if (fruit.rawColor == "FFEB3B") {
            toolbarDetail.setBackgroundColor(Color.parseColor("#F2F4B622"))
            window.statusBarColor = Color.parseColor("#FFF4B622")
        }
        else if (fruit.rawColor == "76FF03" || fruit.rawColor == "64DD17") {
            toolbarDetail.setBackgroundColor(Color.parseColor("#F29CCC65"))
            window.statusBarColor = Color.parseColor("#FF9CCC65")
        }
        else {
            toolbarDetail.setBackgroundColor(Color.parseColor("#F2${fruit.rawColor}"))
            window.statusBarColor = Color.parseColor("#FF${fruit.rawColor}")
        }

    }

}
