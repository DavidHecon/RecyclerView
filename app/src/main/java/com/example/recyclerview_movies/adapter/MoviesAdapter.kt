package com.example.recyclerview_movies.adapter

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_movies.Movies
import com.example.recyclerview_movies.R

class MoviesAdapter (private val moviesList: List<Movies>): RecyclerView.Adapter<MoviesViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MoviesViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        return MoviesViewHolder(layoutInflater.inflate(R.layout.item_movies, p0, false))
    }

    override fun onBindViewHolder(p0: MoviesViewHolder, p1: Int) {
        val item = moviesList[p1]
        p0.render(item)
    }

    override fun getItemCount(): Int = moviesList.size
}