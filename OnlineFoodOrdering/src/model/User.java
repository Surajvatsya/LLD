package model;

import java.time.LocalDateTime;
import java.util.ArrayList; // Added import
import java.util.Collections;
import java.util.List;
// Consider adding import java.util.Collections; if using unmodifiable lists

public class User extends Base {

    private String name;
    private String contactNumber;
    private String email;
    private Address address; // Renamed from 'add'
    // 'final' means the 'orderHistory' variable will always refer to the same ArrayList instance created below.
    // It does NOT make the list's contents immutable (orders can still be added/removed).
    private final List<Order> orderHistory;
    // 'final' means the 'favoriteRestaurants' variable will always refer to the same ArrayList instance created below.
    private final List<Restaurant> favoriteRestaurants; // Corrected spelling


    public User(String id, String name, String contactNumber, String email, Address address) { // Renamed parameter
        super(id);
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
        this.address = address; // Renamed field assignment
        this.orderHistory = new ArrayList<>(); // Initialized list
        this.favoriteRestaurants = new ArrayList<>(); // Initialized list & corrected spelling
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() { // Renamed getter
        return address;
    }

    public void setAddress(Address address) { // Renamed setter and parameter
        this.address = address;
    }

    // TODO: Consider returning an unmodifiable view for better encapsulation.
    // Returning the direct reference allows external code to modify the internal list directly (e.g., history.clear()),
    // bypassing any control logic within the User class.
    // Alternative: return Collections.unmodifiableList(this.orderHistory);
    // This returns a read-only wrapper, preventing external structural modifications (add/remove/clear)
    // while still reflecting internal changes if orders are added via addOrderToHistory().
    // Requires: import java.util.Collections;
    public List<Order> getOrderHistory() {
        // Consider returning an unmodifiable view for better encapsulation.
        return Collections.unmodifiableList(orderHistory);
    }

    // Renamed method to reflect adding an item
    public void addOrderToHistory(Order order) {
        if (order != null) { // Basic null check
             this.orderHistory.add(order);
        }
    }

    // Corrected spelling in getter
    // TODO: Consider returning an unmodifiable view for better encapsulation (see comment above getOrderHistory).
    // Alternative: return Collections.unmodifiableList(this.favoriteRestaurants);
    public List<Restaurant> getFavoriteRestaurants() {
        return Collections.unmodifiableList(favoriteRestaurants);
    }

    // Renamed method and corrected spelling in parameter/method name
    public void addFavoriteRestaurant(Restaurant favoriteRestaurant) {
         if (favoriteRestaurant != null) { // Basic null check
            this.favoriteRestaurants.add(favoriteRestaurant);
         }
    }
}
