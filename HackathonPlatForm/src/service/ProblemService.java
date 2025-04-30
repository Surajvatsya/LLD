package service;

import model.Contestant;
import model.Problem;
import repository.GenericProblemRepository;

import java.util.List;

public class ProblemService implements GenericProblemService{

    private GenericProblemRepository genericProblemRepository;

    public ProblemService(GenericProblemRepository genericProblemRepository) {
        this.genericProblemRepository = genericProblemRepository;
    }

    @Override
    public void addProblem(Problem problem) {
        genericProblemRepository.addProblem(problem);
    }

    @Override
    public List<Problem> getAllProblems() {
        return genericProblemRepository.getAllProblems();
    }

    @Override
    public Problem getProblemById(String problemId) {
        return genericProblemRepository.getProblemById(problemId);
    }
}
