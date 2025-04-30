package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Slot {
    private LocalDateTime date;
    private List<Workout>workOutList;
    private LocalDateTime startTime;
    private LocalDateTime endTime;


    public Slot(LocalDateTime date, LocalDateTime startTime, LocalDateTime endTime) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.workOutList = new ArrayList<>();
    }

    public LocalDateTime getDate() {
        return date;
    }

    public List<Workout> getWorkOutList() {
        return workOutList;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setWorkOutList(Workout workOut) {
        this.workOutList.add(workOut);
    }
}
