package model;

import java.util.*;

public class Contestant {
    public String id;
    public String name;
    public String department;
    List<Submission> submissionsList;

    public Contestant(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.submissionsList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Submission> getSubmissionsList() {
        return submissionsList;
    }

    public void addToSubmissionsList(Submission submission) {
        this.submissionsList.add(submission);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
