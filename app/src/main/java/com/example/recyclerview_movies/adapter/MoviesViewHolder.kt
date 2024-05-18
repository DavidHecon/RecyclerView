package com.example.recyclerview_movies.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview_movies.Movies
import com.example.recyclerview_movies.databinding.ItemMoviesBinding


class MoviesViewHolder (view: View):RecyclerView.ViewHolder(view){

    val binding = ItemMoviesBinding.bind(view)

    fun render(moviesModel: Movies){
        binding.tvNombre.text = moviesModel.nombre
        binding.tvGenero.text = moviesModel.genero
        binding.tvCalificacion.rating = moviesModel.calificacion.toFloat()
        binding.tvClasificacion.text = moviesModel.clasificiacion
        Glide.with(binding.ivMovies.context).load(moviesModel.imagen).into(binding.ivMovies)
            binding.ivMovies.setOnClickListener{
            Toast.makeText(
                binding.ivMovies.context,
                moviesModel.nombre,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}

