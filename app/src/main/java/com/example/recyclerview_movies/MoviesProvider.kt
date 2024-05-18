package com.example.recyclerview_movies

class MoviesProvider {
    companion object{
        val moviesList = listOf<Movies>(
            Movies(
                "Up",
                "Animación",
                "Todo publico",
                4.5,
                "https://play-lh.googleusercontent.com/4-MxW7uPA7P4eugGAivtxjLSGuDhnbOTknTvEp2ZUXogPzf8j_rWCvCSC8YxQ0nuPROcUs_iwoaYUUCQZA"
            ),
            Movies(
                "Deadpool",
                "Acción",
                "+18",
                4.0,
                "https://upload.wikimedia.org/wikipedia/en/2/23/Deadpool_%282016_poster%29.png"
            ),
            Movies(
                "Son como niños",
                "Comedia",
                "+8",
                3.5,
                "https://m.media-amazon.com/images/S/pv-target-images/7b86f2a7e80941d97c265348873a82c73450c0286ed1d1eeb7d86440ec707de5.jpg"
            ),
            Movies(
                "El grinch",
                "Animación",
                "Todo publico",
                4.0,
                "https://musicart.xboxlive.com/7/fbed5000-0000-0000-0000-000000000002/504/image.jpg?w=1920&h=1080"
            ),
            Movies(
                "Luca",
                "Animación",
                "Todo publico",
                5.0,
                "https://lumiere-a.akamaihd.net/v1/images/image_2ff75a5c.jpeg?region=0,0,540,810"
            ),
            Movies(
                "Red",
                "Animación",
                "Todo publico",
                3.5,
                "https://pics.filmaffinity.com/Red-139484368-large.jpg"
            ),
            Movies(
                "Toy Story",
              "Animación",
                "Todo publico",
                4.0,
                "https://cdn.shopify.com/s/files/1/0420/1044/3928/products/00719ToyStory_Blackstone__Rounded.png?v=1628182506"
            ),
            Movies(
                "Hotel Transylvania 3",
                "Animación",
                "Todo publico",
                4.0,
                "https://m.media-amazon.com/images/I/81Q5gsNcguL._AC_UF1000,1000_QL80_.jpg"
            )
        )
    }

}