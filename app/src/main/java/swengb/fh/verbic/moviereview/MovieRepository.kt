package swengb.fh.verbic.moviereview

object MovieRepository {
    private val movies: List<Movie>

    init {
        val lecturerIlles = Person("Sanja Illes", "123")
        val lecturerBloder = Person("Lukas Bloder", "456")
        movies = listOf(
            Movie("0",
                "Title 0",
                "09.10.2019",
                "ABC",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerIlles, lecturerBloder ),
                mutableListOf()
            ),
            Movie("1",
                "Title 1",
                "09.10.2019",
                "XYZ",
                MovieGenre.ACTION,
                lecturerBloder,
                listOf( lecturerIlles, lecturerBloder ),
                mutableListOf()
            )
        )
    }

    fun moviesList(): List<Movie> {
        return movies
    }

    fun movieById(id: String): Movie? {
        return movies.find { it.id == id }
    }

    fun rateMovie(id: String, review: Review) {
        movieById(id)?.reviews?.add(review)
    }
}


