package repository;

import exception.RestaurantNotFoundException;
import model.Restaurant;

/**
 * Interface defining data access operations for Restaurant entities.
 */
public interface RestaurantRepository { // Renamed from GenericRestaurant

    /**
     * Registers a new restaurant or updates an existing one.
     * Implementations should handle potential duplicate IDs (e.g., overwrite or throw exception).
     * @param restaurant The restaurant object to register/update. Must not be null, and restaurant.getId() must not be null.
     * @throws IllegalArgumentException if the restaurant or restaurant ID is null.
     *                                  Consider a specific exception for duplicates if not overwriting.
     */
    void register(Restaurant restaurant);

    /**
     * Retrieves a restaurant by its unique ID.
     * @param id The ID of the restaurant to retrieve. Must not be null.
     * @return The Restaurant object if found.
     * @throws RestaurantNotFoundException if no restaurant is found for the given ID.
     * @throws IllegalArgumentException if id is null.
     */
    Restaurant getRestaurantById(String id) throws RestaurantNotFoundException;

    // TODO: Consider adding other methods like update(Restaurant restaurant), delete(String id), findByName(String name), findByServiceArea(...) etc.
}
