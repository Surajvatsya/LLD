package service;

import model.Contestant;
import repository.GenericContestantRepository;

import java.util.List;

public class UserService implements GenericUserService{

    GenericContestantRepository genericContestantRepository;

    public UserService(GenericContestantRepository genericContestantRepository) {
        this.genericContestantRepository = genericContestantRepository;
    }

    @Override
    public void registerUser(Contestant contestant) {
        genericContestantRepository.addContestant(contestant);
    }

    @Override
    public Contestant getContestantById(String id) {
        return genericContestantRepository.getContestantById(id);

    }

    @Override
    public List<Contestant> getAllContestant() {
        return genericContestantRepository.getAllContestant();
    }
}
