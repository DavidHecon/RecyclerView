package com.example.recyclerview_movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview_movies.adapter.MoviesAdapter
import com.example.recyclerview_movies.databinding.ActivityMainBinding
import android.widget.Toast // Añadir esta línea

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycleView()
        showToast("LUCA es la película con la calificación más alta")
    }

    private fun initRecycleView() {
        val manager = LinearLayoutManager(this)
        binding.recyclerMovies.layoutManager = manager
        binding.recyclerMovies.adapter = MoviesAdapter(MoviesProvider.moviesList)
    }

    // Crear la función showToast
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}

