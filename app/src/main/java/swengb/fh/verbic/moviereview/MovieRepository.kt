package swengb.fh.verbic.moviereview

object MovieRepository {
    private val movies: List<Movie>

    init {
        val director1 = Person (" Hayao Miyazaki", "January 5, 1941")
        val star1 = Person ("Daveigh Chase", "July 24, 1990")
        val star2 = Person ("Suzanne Pleshette", "January 31, 1937")
        val star3 = Person ("Chieko Baishô", "June 29, 1941")
        val star4 = Person ("Takuya Kimura", "November 13, 1972")
        val star5 = Person ( "Hitoshi Takagi", "")
        val star6 = Person ("Noriko Hidaki", "")
        
        movies = listOf(
            Movie("0",
                "Spirited Away",
                "June 20, 2003",
                "During her family's move to the suburbs, a sullen 10-year-old girl wanders into a world ruled by gods, witches, and spirits, and where humans are changed into beasts.",
                MovieGenre.DRAMA,
                director1,
                listOf( star1, star2),
                mutableListOf()
            ),
            Movie("1",
                "Hauru no ugoku shiro",
                "August, 26 2005",
                "When an unconfident young woman is cursed with an old body by a spiteful witch, her only chance of breaking the spell lies with a self-indulgent yet insecure young wizard and his companions in his legged, walking castle.",
                MovieGenre.DRAMA,
                director1,
                listOf( star3, star4),
                mutableListOf()
            ),
            Movie("2",
                "Tonari no Totoro",
                "April, 16 1988",
                "When two girls move to the country to be near their ailing mother, they have adventures with the wondrous forest spirits who live nearby.",
                MovieGenre.DRAMA,
                director1,
                listOf( star5, star6),
                mutableListOf()
            ),
            Movie("3",
                "Spirited Away",
                "June 20, 2003",
                "During her family's move to the suburbs, a sullen 10-year-old girl wanders into a world ruled by gods, witches, and spirits, and where humans are changed into beasts.",
                MovieGenre.DRAMA,
                director1,
                listOf( star1, star2),
                mutableListOf()
            ),
            Movie("4",
                "Hauru no ugoku shiro",
                "August, 26 2005",
                "When an unconfident young woman is cursed with an old body by a spiteful witch, her only chance of breaking the spell lies with a self-indulgent yet insecure young wizard and his companions in his legged, walking castle.",
                MovieGenre.DRAMA,
                director1,
                listOf( star3, star4),
                mutableListOf()
            ),
            Movie("5",
                "Tonari no Totoro",
                "April, 16 1988",
                "When two girls move to the country to be near their ailing mother, they have adventures with the wondrous forest spirits who live nearby.",
                MovieGenre.DRAMA,
                director1,
                listOf( star5, star6),
                mutableListOf()
            ),
            Movie("6",
                "Spirited Away",
                "June 20, 2003",
                "During her family's move to the suburbs, a sullen 10-year-old girl wanders into a world ruled by gods, witches, and spirits, and where humans are changed into beasts.",
                MovieGenre.DRAMA,
                director1,
                listOf( star1, star2),
                mutableListOf()
            ),
            Movie("7",
                "Hauru no ugoku shiro",
                "August, 26 2005",
                "When an unconfident young woman is cursed with an old body by a spiteful witch, her only chance of breaking the spell lies with a self-indulgent yet insecure young wizard and his companions in his legged, walking castle.",
                MovieGenre.DRAMA,
                director1,
                listOf( star3, star4),
                mutableListOf()
            ),
            Movie("8",
                "Tonari no Totoro",
                "April, 16 1988",
                "When two girls move to the country to be near their ailing mother, they have adventures with the wondrous forest spirits who live nearby.",
                MovieGenre.DRAMA,
                director1,
                listOf( star5, star6),
                mutableListOf()
            ),
            Movie("9",
                "Spirited Away",
                "June 20, 2003",
                "During her family's move to the suburbs, a sullen 10-year-old girl wanders into a world ruled by gods, witches, and spirits, and where humans are changed into beasts.",
                MovieGenre.DRAMA,
                director1,
                listOf( star1, star2),
                mutableListOf()
            ),
            Movie("10",
                "Hauru no ugoku shiro",
                "August, 26 2005",
                "When an unconfident young woman is cursed with an old body by a spiteful witch, her only chance of breaking the spell lies with a self-indulgent yet insecure young wizard and his companions in his legged, walking castle.",
                MovieGenre.DRAMA,
                director1,
                listOf( star3, star4),
                mutableListOf()
            ),
            Movie("11",
                "Tonari no Totoro",
                "April, 16 1988",
                "When two girls move to the country to be near their ailing mother, they have adventures with the wondrous forest spirits who live nearby.",
                MovieGenre.DRAMA,
                director1,
                listOf( star5, star6),
                mutableListOf()
            ),
            Movie("12",
                "Spirited Away",
                "June 20, 2003",
                "During her family's move to the suburbs, a sullen 10-year-old girl wanders into a world ruled by gods, witches, and spirits, and where humans are changed into beasts.",
                MovieGenre.DRAMA,
                director1,
                listOf( star1, star2),
                mutableListOf()
            ),
            Movie("13",
                "Hauru no ugoku shiro",
                "August, 26 2005",
                "When an unconfident young woman is cursed with an old body by a spiteful witch, her only chance of breaking the spell lies with a self-indulgent yet insecure young wizard and his companions in his legged, walking castle.",
                MovieGenre.DRAMA,
                director1,
                listOf( star3, star4),
                mutableListOf()
            ),
            Movie("14",
                "Tonari no Totoro",
                "April, 16 1988",
                "When two girls move to the country to be near their ailing mother, they have adventures with the wondrous forest spirits who live nearby.",
                MovieGenre.DRAMA,
                director1,
                listOf( star5, star6),
                mutableListOf()
            ),
            Movie("15",
                "Spirited Away",
                "June 20, 2003",
                "During her family's move to the suburbs, a sullen 10-year-old girl wanders into a world ruled by gods, witches, and spirits, and where humans are changed into beasts.",
                MovieGenre.DRAMA,
                director1,
                listOf( star1, star2),
                mutableListOf()
            ),
            Movie("16",
                "Hauru no ugoku shiro",
                "August, 26 2005",
                "When an unconfident young woman is cursed with an old body by a spiteful witch, her only chance of breaking the spell lies with a self-indulgent yet insecure young wizard and his companions in his legged, walking castle.",
                MovieGenre.DRAMA,
                director1,
                listOf( star3, star4),
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


