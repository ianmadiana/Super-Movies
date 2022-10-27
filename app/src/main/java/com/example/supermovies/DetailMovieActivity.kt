package com.example.supermovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailMovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val supermovies = intent.getParcelableExtra<Movies>(MainActivity.INTENT_PARCELABLE)

        val imgMovie = findViewById<ImageView>(R.id.img_item_photo)
        val titleMovie = findViewById<TextView>(R.id.tv_item_name)
        val descMovie = findViewById<TextView>(R.id.tv_item_description)

        imgMovie.setImageResource(supermovies?.imgMovie!!)
        titleMovie.text = supermovies.titleMovie
        descMovie.text = supermovies.descMovie
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}