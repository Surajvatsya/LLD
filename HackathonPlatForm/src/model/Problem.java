package model;

import java.util.List;

public class Problem {
    public String id;
    public String title;
    public String description;
    public List <Tag> tagList;
    public String difficultylevel;
    public int score;
    public int timeCount;
    public int solvedCount;

    public Problem(String id, String title, String description, List<Tag> tagList, String difficultylevel, int score, int timeCount, int solvedCount) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.tagList = tagList;
        this.difficultylevel = difficultylevel;
        this.score = score;
        this.timeCount = timeCount;
        this.solvedCount = solvedCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    public String getDifficultylevel() {
        return difficultylevel;
    }

    public void setDifficultylevel(String difficultylevel) {
        this.difficultylevel = difficultylevel;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTimeCount() {
        return timeCount;
    }

    public void setTimeCount(int timeCount) {
        this.timeCount = timeCount;
    }

    public int getSolvedCount() {
        return solvedCount;
    }

    public void setSolvedCount(int solvedCount) {
        this.solvedCount = solvedCount;
    }
}
