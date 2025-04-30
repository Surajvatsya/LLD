package model;

import java.util.List;

public class Menu {
    private List<Item> dishList;
    public final String id;

    public Menu(List<Item> dishList, String id) {
        this.dishList = dishList;
        this.id = id;
    }

    public List<Item> getDishList() {
        return dishList;
    }

    public void setDishList(Item dishList) {
        this.dishList.add(dishList);
    }

    public String getId() {
        return id;
    }
}
