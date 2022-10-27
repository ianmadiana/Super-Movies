package com.example.supermovies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE= "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moviesList = listOf<Movies>(
            Movies(
                R.drawable.sing2_desk,
                "Sing 2",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam sit amet lacus hendrerit, ultrices mauris eu, dictum mi. Nunc iaculis risus in quam molestie consequat. Suspendisse vehicula mi velit. Curabitur varius arcu dolor, a ullamcorper leo malesuada sit amet. Cras nec ante iaculis, fermentum tortor quis, tincidunt tortor. Fusce fermentum nisi eget nibh dignissim posuere. Sed tempor in est eu scelerisque. Maecenas efficitur, lorem id venenatis volutpat, ante nibh fermentum metus, accumsan pulvinar lectus felis imperdiet arcu. Morbi a vehicula justo, sit amet convallis magna. Praesent non magna augue. Fusce vel dolor blandit, consequat lacus ut, convallis lectus. Etiam pellentesque a arcu a hendrerit. Cras ut mollis mi, in faucibus mi. Vivamus varius eros non purus consequat, sed fringilla elit iaculis. Suspendisse nec varius ex, eget vulputate nulla."
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
            val intent = Intent(this, DetailMovieActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}