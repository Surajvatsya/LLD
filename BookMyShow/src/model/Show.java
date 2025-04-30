package model;

import java.util.List;

public class Show {
    private String id;
    private String language;
    private List<showSeat> showSeats;

    public Show(String id, String language, List<showSeat> showSeats) {
        this.id = id;
        this.language = language;
        this.showSeats = showSeats;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<showSeat> getShowSeats() {
        return showSeats;
    }

    public void setShowSeats(List<showSeat> showSeats) {
        this.showSeats = showSeats;
    }
}
