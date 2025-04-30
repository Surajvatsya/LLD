package controller;

import model.Problem;
import service.GenericProblemService;

import java.util.List;

public class ProblemController {
    private GenericProblemService genericProblemService;

    public ProblemController(GenericProblemService genericProblemService) {
        this.genericProblemService = genericProblemService;
    }

    public void addProblems(Problem problem){
        genericProblemService.addProblem(problem);
    }
    public List<Problem> getAllProblems(){
        return genericProblemService.getAllProblems();
    }

    public Problem getProblemById(String problemId){
        return  genericProblemService.getProblemById(problemId);
    }
}
