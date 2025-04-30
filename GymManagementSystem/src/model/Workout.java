package model;

public class Workout {
    private String workoutType;
    long noOfSeats;
    Boolean isAvailable;

    public Workout(String workoutType, long noOfSeats) {
        this.workoutType = workoutType;
        this.noOfSeats = noOfSeats;
        isAvailable = true;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    public long getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(long noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}
