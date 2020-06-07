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

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    private val textWhite   = Color.parseColor("#E0E0E0")
    private lateinit var rootLayout: RelativeLayout
    private lateinit var toolbarDetail: Toolbar
    private lateinit var toolbarDetTitle: TextView
    private lateinit var detailScrollView: ScrollView
    private lateinit var detailCardView: CardView
    private lateinit var title: TextView
    private lateinit var image: ImageView
    private lateinit var imageHint: TextView
    private lateinit var detailDesc: TextView
    private lateinit var detailWiki: TextView
    private lateinit var detailGoogle: TextView
    private lateinit var fruit: Fruit

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        // set window flags
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

        fruit           = FruitData.getFruitX(intent.getIntExtra("position", 0))
        rootLayout      = findViewById(R.id.detail_rootLayout)
        toolbarDetail   = findViewById(R.id.detail_toolbar)
        toolbarDetTitle = findViewById(R.id.toolbar_title)
        detailScrollView= findViewById(R.id.detail_scrollView)
        detailCardView  = findViewById(R.id.detail_cardView)
        title           = findViewById(R.id.detail_title)
        image           = findViewById(R.id.detail_image)
        imageHint       = findViewById(R.id.detail_imageHint)
        detailDesc      = findViewById(R.id.detail_desc)
        detailWiki      = findViewById(R.id.detail_wiki)
        detailGoogle    = findViewById(R.id.detail_google)

        // setting toolbar
        setSupportActionBar(toolbarDetail)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        toolbarDetail.setNavigationIcon(R.drawable.icon_back)
        toolbarDetail.setNavigationOnClickListener {finish()}
        toolbarDetTitle.text    = "Detail"

        Glide.with(toolbarDetail.context).
            load(fruit.imageID).
            apply(RequestOptions().override(1200, 800)).
            into(image)

        // matching color if wallpaper is dark
        if (WallpaperData.getCurrentPos() == 1) {
            rootLayout.setBackgroundResource(WallpaperData.getWallpaperId())
            detailCardView.setCardBackgroundColor(Color.parseColor(
                "#88${WallpaperData.getToolbarColor().replace("#","")}"))
            title.setTextColor(textWhite)
            imageHint.setTextColor(textWhite)
            detailDesc.setTextColor(textWhite)
            detailWiki.setTextColor(Color.BLACK)
            detailGoogle.setTextColor(Color.BLACK)
            setToolbarColor(WallpaperData.getToolbarColor())
        } else {
            rootLayout.setBackgroundColor(Color.parseColor("#1d${fruit.rawColor}"))
            detailCardView.setCardBackgroundColor(Color.parseColor("#2a${fruit.rawColor}"))
            setToolbarColor()
        }

        title.text  = fruit.name
        imageHint.text  = "Gambar dari buah ${fruit.name}"
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
            R.id.detail_wiki -> {
                val wikiIntent  = Intent(Intent.ACTION_VIEW, Uri.parse(fruit.wikiLink))
                startActivity(wikiIntent)
            }
            R.id.detail_google -> {
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
