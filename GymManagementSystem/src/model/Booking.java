package model;

public class Booking extends BaseClass {
    private User user;
    private Slot slot;
    private Workout workout;
    private Center center;

    public Booking(User user, Workout workout, Slot slot,Center center) {
        this.user = user;
        this.workout = workout;
        this.slot = slot;
        this.center = center;
    }
}
