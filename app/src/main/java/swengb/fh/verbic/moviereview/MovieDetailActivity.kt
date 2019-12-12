package swengb.fh.verbic.moviereview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_movie_detail.*
import swengb.fh.verbic.moviereview.MovieRepository.movieById

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val movieID = intent.getStringExtra(MovieListActivity.EXTRA_MOVIE_ID)

        if (movieID == null) {
            Toast.makeText(this, "No movieID given", Toast.LENGTH_SHORT).show()
            finish()
        } else {
            title_detail.text = movieById(movieID)!!.title
            director_content.text = movieById(movieID)!!.director.name
            actors_content.text = movieById(movieID)!!.actors.map { it.name }.joinToString()
            genre_content.text = movieById(movieID)!!.genre.name
            item_movie_avg_rating_bar.rating = movieById((movieID))!!.ratingAverage().toFloat()
            item_movie_avg_rating_value.text = movieById(movieID)!!.ratingAverage().toString()
            item_movie_rating_count.text = movieById(movieID)!!.reviews.size.toString()
            release_content.text = movieById(movieID)!!.release
            plot_content.text = movieById(movieID)!!.plot
        }

        open_movie_review.setOnClickListener {
            val intent = Intent(this, MovieReviewActivity::class.java)
            intent.putExtra("PassedID", movieID)
            startActivity(intent)
        }
    }
}


