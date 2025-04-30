package repository;

import model.Workout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WorkoutRepository implements GenericWorkOutRepository{

    private HashMap <String, Workout> workoutHashMap = new HashMap<>();
    @Override
    public void createWorkout(Workout workout) {
        workoutHashMap.put(workout.getWorkoutType(),workout);
        System.out.println("Workout Added Successfully");
    }

    @Override
    public List<Workout> getAllWorkOuts() {
        List<Workout> workoutList = new ArrayList<>();
        for(Workout workout : workoutHashMap.values()){
            workoutList.add(workout);
        }
        return workoutList;
    }

    @Override
    public Workout getWorkoutByName(String workoutName) {
        if(workoutHashMap.containsKey(workoutName))
            return  workoutHashMap.get(workoutName);
        else{
            System.out.println("No Workout Found");
            return null;
        }
    }
}
