package repository;

import model.Workout;

import java.util.List;

public interface GenericWorkOutRepository {
    void createWorkout(Workout workout);
    List<Workout> getAllWorkOuts();
    Workout getWorkoutByName(String workoutName);
}
