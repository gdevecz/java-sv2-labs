package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie newMovie) {
        movies.add(newMovie);
    }

    public List<Movie> getGoodMoviesWithCategoryGiven(Category animation) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getRating() > 3) {
                result.add(movie);
            }
        }
        return result;
    }
}
