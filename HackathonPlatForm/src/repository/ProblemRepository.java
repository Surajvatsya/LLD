package repository;

import model.Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProblemRepository implements GenericProblemRepository{


    HashMap<String, Problem> problemHashMap = new HashMap<>();
    @Override
    public void addProblem(Problem problem) {
        problemHashMap.put(problem.getId(), problem);
        System.out.println("Problem addedd");
    }

    @Override
    public Problem getProblemById(String problemId) {
        if(problemHashMap.containsKey(problemId))
            return problemHashMap.get(problemId);
        System.out.println("No Problem found");
        return null;
    }

    @Override
    public List<Problem> getAllProblems() {
        List<Problem> problemList = new ArrayList<>();
        for(Problem problem : problemHashMap.values())
            problemList.add(problem);
        return problemList;
    }
}
