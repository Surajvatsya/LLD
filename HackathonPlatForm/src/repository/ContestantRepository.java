package repository;

import model.Contestant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContestantRepository implements GenericContestantRepository{

    HashMap<String, Contestant> contestantHashMap = new HashMap<>();

    @Override
    public void addContestant(Contestant contestant) {
        contestantHashMap.put(contestant.getId(), contestant);
        System.out.println("Contestant addedd successfully");
    }

    @Override
    public Contestant getContestantById(String contestantId) {
        if(contestantHashMap.containsKey(contestantId))
            return contestantHashMap.get(contestantId);
        else
        {
            System.out.println("Not FOund");
            return null;
        }


    }

    @Override
    public List<Contestant> getAllContestant() {
        List<Contestant>contestantList = new ArrayList<>();
        for(Contestant contestant : contestantHashMap.values())
            contestantList.add(contestant);
        return contestantList;
    }
}
