package service;

import model.Contestant;

import java.util.List;

public interface GenericUserService {
    public void registerUser(Contestant contestant);
    public Contestant getContestantById (String id);
    public List<Contestant> getAllContestant();
}
