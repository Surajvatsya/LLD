package repository;

import model.Problem;

import java.util.List;

public interface GenericProblemRepository {
    void addProblem(Problem problem);
    Problem getProblemById(String problemId);
    List<Problem> getAllProblems();
}
