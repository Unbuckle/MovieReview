package swengb.fh.verbic.moviereview

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_movie_review.*

class MovieReviewActivity : AppCompatActivity() {

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.getItemId()
        if (id == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_movie_review)

            val movieId = intent.getStringExtra("PassedID")

            if (movieId == null) {
                Toast.makeText(this, "No movieID given", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                val movieName = MovieRepository.movieById(movieId)?.title
                movie_rating_header.text = movieName

                rate_movie.setOnClickListener{
                    val ratingValue = movie_rating_bar.rating.toDouble()
                    val feedback = movie_feedback.text.toString()
                    val rating = Review(ratingValue, feedback)

                    MovieRepository.rateMovie(movieId,rating)

                    setResult(Activity.RESULT_OK)

                    val intent = Intent (this, MovieDetailActivity::class.java)
                    intent.putExtra(MovieListActivity.EXTRA_MOVIE_ID, movieId)
                    startActivity(intent)
                }


                movie_rating_bar.rating.toDouble()
                movie_feedback.text.toString()
            }

        }

    }

