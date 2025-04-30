package model;

public class Seat {
    private String id;
    private SeatType seatType;

    public Seat(String id, SeatType seatType) {
        this.id = id;
        this.seatType = seatType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }
}
