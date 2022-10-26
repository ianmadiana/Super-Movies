package com.example.supermovies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moviesList = listOf<Movies>(
            Movies(
                R.drawable.sing2_desk,
                "Sing 2",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            ),
            Movies(
                R.drawable.the355,
                "The 355",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            ),
            Movies(
                R.drawable.scream_desk,
                "Scream",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            ),
            Movies(
                R.drawable.morbius,
                "Morbius",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            ),
            Movies(
                R.drawable.uncharted_desk,
                "Uncharted",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            ),
            Movies(
                R.drawable._563782,
                "Turning Red",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            ),
            Movies(
                R.drawable.the_batman,
                "The Batman",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            ),
            Movies(
                R.drawable.nightmare_alley,
                "Nightmare Alley",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            ),
            Movies(
                R.drawable.daone,
                "Downtown Abbey A New Era",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            ),
            Movies(
                R.drawable.death_on_the_nile,
                "Death on The Nile",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_movie)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter=SuperMoviesAdapter(this, moviesList){

        }
    }
}