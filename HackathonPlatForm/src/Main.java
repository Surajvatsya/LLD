import controller.ProblemController;
import model.Contestant;
import model.Problem;
import model.Tag;
import repository.ProblemRepository;
import service.ProblemService;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Contestant user1 = new Contestant("1","Suraj","Tech");
        Contestant user2 = new Contestant("2","Vamsi","Tech Giant");
        Tag tag1 = new Tag("T1","DP");
        Tag tag2 = new Tag("T1","Binary");
        List<Tag> tagList = new ArrayList<>();
        Problem problem = new Problem("P1","Title","Desc",tagList,"HARD",10,0,0);

        ProblemRepository problemRepository = new ProblemRepository();
        ProblemService problemService = new ProblemService(problemRepository);

        ProblemController problemController = new ProblemController(problemService);

        problemController.addProblems(problem);

        List<Problem> problems = problemController.getAllProblems();
        for(Problem problem1 : problems){
            System.out.println(problem1.getTitle() + " " + problem1.getDescription());
        }

    }
}