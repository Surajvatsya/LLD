package model;

public class showSeat {
    private Seat seat;
    private ShowSeatPrice showSeatPrice;
    private SeatStatus seatStatus;

    public showSeat(Seat seat, ShowSeatPrice showSeatPrice, SeatStatus seatStatus) {
        this.seat = seat;
        this.showSeatPrice = showSeatPrice;
        this.seatStatus = seatStatus;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public ShowSeatPrice getShowSeatPrice() {
        return showSeatPrice;
    }

    public void setShowSeatPrice(ShowSeatPrice showSeatPrice) {
        this.showSeatPrice = showSeatPrice;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }
}
