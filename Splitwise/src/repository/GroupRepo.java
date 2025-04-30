package repository;

import model.Group;

import java.util.HashMap;

public class GroupRepo implements GroupRepoInterface{

    private HashMap<String, Group> groupHashMap = new HashMap<>();

    @Override
    public void createGroup(Group group) {
        groupHashMap.put(group.getId(),group);
    }


}
