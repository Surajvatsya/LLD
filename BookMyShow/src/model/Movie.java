package model;

import java.time.LocalDateTime;
import java.util.List;

public class Movie {
    private String id;
    private String movieName;
//    private String language;
    private LocalDateTime releaseDate;
    private double duration;
    private String genre;
    private double rating;
    private String descerption;
    private List<Cast>castList;


    public Movie(String id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }
}
