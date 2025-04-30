package repository;

import model.Contestant;
import java.util.*;

public interface GenericContestantRepository {
    void addContestant(Contestant contestant);
    Contestant getContestantById(String contestantId);
    List<Contestant> getAllContestant();
}
