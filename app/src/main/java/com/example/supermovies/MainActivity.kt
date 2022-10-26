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
                R.drawable.film1_sing2,
                "Sing 2",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed rhoncus mi. Proin consectetur bibendum dictum. Phasellus non viverra ipsum, sit amet sodales elit. Morbi faucibus nisl ut dui tempor, ac tristique arcu ultrices. Sed erat quam, mattis ut dui et, pharetra varius massa. Ut dictum rhoncus ex vitae suscipit. Fusce ut ullamcorper nunc, in posuere risus. Fusce eget tristique urna. Donec condimentum sem eu feugiat aliquam. Phasellus varius dictum justo, quis porta ligula mattis vehicula. Phasellus volutpat malesuada libero et posuere. Vestibulum aliquam dui at commodo imperdiet. Phasellus efficitur metus vel lorem laoreet interdum. Pellentesque cursus pretium hendrerit. Nunc tincidunt augue non tortor dapibus pellentesque. Fusce malesuada scelerisque est, non placerat augue cursus non."
            ),
            Movies(
                R.drawable.film2_the355,
                "The 355",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed rhoncus mi. Proin consectetur bibendum dictum. Phasellus non viverra ipsum, sit amet sodales elit. Morbi faucibus nisl ut dui tempor, ac tristique arcu ultrices. Sed erat quam, mattis ut dui et, pharetra varius massa. Ut dictum rhoncus ex vitae suscipit. Fusce ut ullamcorper nunc, in posuere risus. Fusce eget tristique urna. Donec condimentum sem eu feugiat aliquam. Phasellus varius dictum justo, quis porta ligula mattis vehicula. Phasellus volutpat malesuada libero et posuere. Vestibulum aliquam dui at commodo imperdiet. Phasellus efficitur metus vel lorem laoreet interdum. Pellentesque cursus pretium hendrerit. Nunc tincidunt augue non tortor dapibus pellentesque. Fusce malesuada scelerisque est, non placerat augue cursus non."
            ),
            Movies(
                R.drawable.film3_scream,
                "Scream",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed rhoncus mi. Proin consectetur bibendum dictum. Phasellus non viverra ipsum, sit amet sodales elit. Morbi faucibus nisl ut dui tempor, ac tristique arcu ultrices. Sed erat quam, mattis ut dui et, pharetra varius massa. Ut dictum rhoncus ex vitae suscipit. Fusce ut ullamcorper nunc, in posuere risus. Fusce eget tristique urna. Donec condimentum sem eu feugiat aliquam. Phasellus varius dictum justo, quis porta ligula mattis vehicula. Phasellus volutpat malesuada libero et posuere. Vestibulum aliquam dui at commodo imperdiet. Phasellus efficitur metus vel lorem laoreet interdum. Pellentesque cursus pretium hendrerit. Nunc tincidunt augue non tortor dapibus pellentesque. Fusce malesuada scelerisque est, non placerat augue cursus non."
            ),
            Movies(
                R.drawable.film5_morbius,
                "Morbius",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed rhoncus mi. Proin consectetur bibendum dictum. Phasellus non viverra ipsum, sit amet sodales elit. Morbi faucibus nisl ut dui tempor, ac tristique arcu ultrices. Sed erat quam, mattis ut dui et, pharetra varius massa. Ut dictum rhoncus ex vitae suscipit. Fusce ut ullamcorper nunc, in posuere risus. Fusce eget tristique urna. Donec condimentum sem eu feugiat aliquam. Phasellus varius dictum justo, quis porta ligula mattis vehicula. Phasellus volutpat malesuada libero et posuere. Vestibulum aliquam dui at commodo imperdiet. Phasellus efficitur metus vel lorem laoreet interdum. Pellentesque cursus pretium hendrerit. Nunc tincidunt augue non tortor dapibus pellentesque. Fusce malesuada scelerisque est, non placerat augue cursus non."
            ),
            Movies(
                R.drawable.film7_uncharted,
                "Uncharted",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed rhoncus mi. Proin consectetur bibendum dictum. Phasellus non viverra ipsum, sit amet sodales elit. Morbi faucibus nisl ut dui tempor, ac tristique arcu ultrices. Sed erat quam, mattis ut dui et, pharetra varius massa. Ut dictum rhoncus ex vitae suscipit. Fusce ut ullamcorper nunc, in posuere risus. Fusce eget tristique urna. Donec condimentum sem eu feugiat aliquam. Phasellus varius dictum justo, quis porta ligula mattis vehicula. Phasellus volutpat malesuada libero et posuere. Vestibulum aliquam dui at commodo imperdiet. Phasellus efficitur metus vel lorem laoreet interdum. Pellentesque cursus pretium hendrerit. Nunc tincidunt augue non tortor dapibus pellentesque. Fusce malesuada scelerisque est, non placerat augue cursus non."
            ),
            Movies(
                R.drawable.film9_turning_red,
                "Turning Red",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed rhoncus mi. Proin consectetur bibendum dictum. Phasellus non viverra ipsum, sit amet sodales elit. Morbi faucibus nisl ut dui tempor, ac tristique arcu ultrices. Sed erat quam, mattis ut dui et, pharetra varius massa. Ut dictum rhoncus ex vitae suscipit. Fusce ut ullamcorper nunc, in posuere risus. Fusce eget tristique urna. Donec condimentum sem eu feugiat aliquam. Phasellus varius dictum justo, quis porta ligula mattis vehicula. Phasellus volutpat malesuada libero et posuere. Vestibulum aliquam dui at commodo imperdiet. Phasellus efficitur metus vel lorem laoreet interdum. Pellentesque cursus pretium hendrerit. Nunc tincidunt augue non tortor dapibus pellentesque. Fusce malesuada scelerisque est, non placerat augue cursus non."
            ),
            Movies(
                R.drawable.film8_the_batman,
                "The Batman",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed rhoncus mi. Proin consectetur bibendum dictum. Phasellus non viverra ipsum, sit amet sodales elit. Morbi faucibus nisl ut dui tempor, ac tristique arcu ultrices. Sed erat quam, mattis ut dui et, pharetra varius massa. Ut dictum rhoncus ex vitae suscipit. Fusce ut ullamcorper nunc, in posuere risus. Fusce eget tristique urna. Donec condimentum sem eu feugiat aliquam. Phasellus varius dictum justo, quis porta ligula mattis vehicula. Phasellus volutpat malesuada libero et posuere. Vestibulum aliquam dui at commodo imperdiet. Phasellus efficitur metus vel lorem laoreet interdum. Pellentesque cursus pretium hendrerit. Nunc tincidunt augue non tortor dapibus pellentesque. Fusce malesuada scelerisque est, non placerat augue cursus non."
            ),
            Movies(
                R.drawable.film4_nightmare_alley,
                "Nightmare Alley",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sed rhoncus mi. Proin consectetur bibendum dictum. Phasellus non viverra ipsum, sit amet sodales elit. Morbi faucibus nisl ut dui tempor, ac tristique arcu ultrices. Sed erat quam, mattis ut dui et, pharetra varius massa. Ut dictum rhoncus ex vitae suscipit. Fusce ut ullamcorper nunc, in posuere risus. Fusce eget tristique urna. Donec condimentum sem eu feugiat aliquam. Phasellus varius dictum justo, quis porta ligula mattis vehicula. Phasellus volutpat malesuada libero et posuere. Vestibulum aliquam dui at commodo imperdiet. Phasellus efficitur metus vel lorem laoreet interdum. Pellentesque cursus pretium hendrerit. Nunc tincidunt augue non tortor dapibus pellentesque. Fusce malesuada scelerisque est, non placerat augue cursus non."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_movie)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter=SuperMoviesAdapter(this, moviesList){

        }
    }
}