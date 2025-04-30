package repository;

import model.Show;

public interface ShowRepoInterface {
    void addShow(Show show);
    Show getShow(String id);
}
