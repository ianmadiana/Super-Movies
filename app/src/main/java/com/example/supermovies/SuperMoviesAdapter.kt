package com.example.supermovies

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SuperMoviesAdapter(private val context: Context, private val movie: List<Movies>, val listener: (Movies)-> Unit)
    : RecyclerView.Adapter<SuperMoviesAdapter.SuperMoviesViewHolder>() {

    class SuperMoviesViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imgMovie = view.findViewById<ImageView>(R.id.img_item_photo)
        val titleMovie = view.findViewById<TextView>(R.id.tv_item_name)
        val descMovie = view.findViewById<TextView>(R.id.tv_item_description)


        fun bindView(supermovies: Movies, listener: (Movies) -> Unit) {
            imgMovie.setImageResource(supermovies.imgMovie)
            titleMovie.text = supermovies.titleMovie
            descMovie.text = supermovies.descMovie
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperMoviesViewHolder {
        return SuperMoviesViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_movies, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SuperMoviesViewHolder, position: Int) {
        holder.bindView(movie[position], listener)
    }

    override fun getItemCount(): Int = movie.size
}