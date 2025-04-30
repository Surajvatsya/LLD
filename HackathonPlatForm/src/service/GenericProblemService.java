package service;

import model.Problem;

import java.util.List;

public interface GenericProblemService {
    void addProblem(Problem problem);
    List<Problem> getAllProblems();
    Problem getProblemById(String problemId);
    //  Contestants should be able to filter problems based on difficulty level or tags
    //  and sort them based on score (design should be extensible to other attributes )

}
