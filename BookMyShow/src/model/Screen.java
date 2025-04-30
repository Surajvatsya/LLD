package model;

import java.util.List;

public class Screen {
    private String name;
    private List<Movie>MovieList;
    private List<Seat>seatList;
    private ScreenType screenType;

    public Screen(String name, List<Movie> MovieList, List<Seat> seatList, ScreenType screenType) {
        this.name = name;
        this.MovieList = MovieList;
        this.seatList = seatList;
        this.screenType = screenType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Movie> getMovieList() {
        return MovieList;
    }

    public void setMovieList(List<Movie> MovieList) {
        this.MovieList = MovieList;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(Seat seat) {
        this.seatList.add(seat);
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public void setScreenType(ScreenType screenType) {
        this.screenType = screenType;
    }
}
