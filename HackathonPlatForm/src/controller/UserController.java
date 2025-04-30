package controller;

import model.Contestant;
import service.GenericProblemService;
import service.GenericUserService;

import java.util.List;

public class UserController {
    GenericUserService genericUserService;
    void registerUser (Contestant contestant){
        genericUserService.registerUser(contestant);
    }
    List<Contestant> getAllContestants() {
        return genericUserService.getAllContestant();
    }
    Contestant getContastantById(String id){
        return genericUserService.getContestantById(id);
    }
}
