package model;

import java.util.List;

public class City {
    private String name;
    private List<Theater> theaterList;

    public City(String name, List<Theater> theaterList) {
        this.name = name;
        this.theaterList = theaterList;
    }

    public String getName() {
        return name;
    }

    public List<Theater> getTheaterList() {
        return theaterList;
    }

    public void setTheaterList(Theater theater) {
        this.theaterList.add(theater);
    }
}
