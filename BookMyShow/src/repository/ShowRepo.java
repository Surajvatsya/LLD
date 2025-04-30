package repository;

import model.Show;

import java.util.HashMap;

public class ShowRepo implements ShowRepoInterface{

    private HashMap<String, Show> showHashMap = new HashMap<>();

    @Override
    public void addShow(Show show) {
         showHashMap.put(show.getId(),show);
    }

    @Override
    public Show getShow(String id) {
        return  showHashMap.get(id);
    }
}
