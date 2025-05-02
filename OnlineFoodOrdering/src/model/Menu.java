package model;

import java.util.ArrayList; // Added import
import java.util.Collections; // Added import
import java.util.List;

// Represents a restaurant's menu
public class Menu {
    // TODO: Consider extending Base if Menu needs createdAt/updatedAt
    // Made final: The reference won't change, but the list content can be modified via addItem/removeItem etc.
    private final List<Item> dishList;
    public final String id; // ID is final, set in constructor

    /**
     * Constructor for Menu.
    //  * Creates a defensive copy of the provided dishList to prevent external modifications.
    //  * @param initialDishList The initial list of items for the menu.
    //  * @param id The unique ID for the menu.
    //  */

     // remember to insitialise new ArrayList<>() arraylist inside constructor only
    public Menu(List<Item> initialDishList, String id) {
        // Defensive copy: Create a new list from the provided one
        this.dishList = (initialDishList == null) ? new ArrayList<>() : new ArrayList<>(initialDishList);
        this.id = id;
    }

    /**
     * Returns an unmodifiable view of the dish list.
     * Prevents external code from modifying the list structure directly.
     * @return An unmodifiable List of Items.
     */
    public List<Item> getDishList() {
        return Collections.unmodifiableList(dishList);
    }

    /**
     * Adds an item to the menu's dish list.
     * Renamed from setDishList for clarity.
     * @param item The Item to add.
     */
    public void addItem(Item item) { // Renamed method and parameter
        if (item != null) { // Basic null check
            this.dishList.add(item);
        }
    }

    // Consider adding methods like removeItem(Item item), updateItem(Item item) if needed

    public String getId() {
        return id;
    }
}
// Removed trailing comments
