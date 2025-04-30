package repository;


import model.User;

//created user repo not driver or passenger
public interface UserRepoInterface {
void register(User user);
User getUser(String userId);
}








































//
//Excellent question — you're digging into the **practical side of data persistence and retrieval**, and this is key in building a reliable backend.
//
//Let’s walk through your concern:
//
//        ---
//
//        ## 🎯 Your concern:
//
//You have this in `Driver`:
//        ```java
//private String vehicleNumber;
//private VehicleType vehicleType;
//```
//
//But if you're storing users in a single `UserRepository` using something like:
//
//        ```java
//Map<String, UserRepo> userMap = new HashMap<>();
//```
//
//You're worried: ❓ **"Are these driver-specific fields (`vehicleNumber`, etc.) even stored or accessible?"**
//
//        ---
//
//        ## ✅ Short Answer:
//
//        > YES ✅ — these fields **are stored and accessible** as long as you're storing the correct `Driver` object in your `UserRepository`.
//
//        ---
//
//        ### 🔎 What happens in memory?
//
//Let's break it down step-by-step:
//
//        ### 1. You create a driver:
//        ```java
//Driver d = new Driver("D1", "Ravi", "9876543210", "KA09AB1234", VehicleType.SEDAN);
//userRepo.save(d);
//```
//
//        ### 2. Inside `userRepo.save(...)`:
//You store the `Driver` object (which is a subclass of `UserRepo`):
//        ```java
//userMap.put(d.getId(), d); // Stored as a UserRepo, but actual object is Driver
//        ```
//
//        ### 3. Later in `DriverService`:
//You retrieve and cast it:
//        ```java
//UserRepo u = userRepo.getById("D1");
//
//if (u instanceof Driver) {
//Driver d = (Driver) u;
//    System.out.println(d.getVehicleNumber()); // ✅ Works fine
//        }
//        ```
//
//This is called **polymorphic retrieval** — Java maintains the actual type (Driver) even if you store it as `UserRepo`.
//
//        ---
//
//        ## ✅ In summary:
//
//        | ✅ Your Field               | Stored in HashMap? | Access in Service Layer? | How |
//        |----------------------------|--------------------|---------------------------|-----|
//        | `vehicleNumber`, `vehicleType` | ✅ Yes             | ✅ Yes                    | Cast from `UserRepo` to `Driver` |
//
//        ---
//
//        ## 💡 Bonus: Defensive Programming
//
//You can make it safer:
//        ```java
//public Optional<Driver> getDriverById(String id) {
//    UserRepo user = userRepo.getById(id);
//    if (user instanceof Driver) {
//        return Optional.of((Driver) user);
//    }
//    return Optional.empty();
//}
//```
//
//        ---
//
//        ## 🔧 If you ever use a DB (JPA/Hibernate)
//
//- Same structure works with `@Inheritance(strategy = InheritanceType.JOINED)`
//        - The DB will have one `user` table and one `driver` table with extra columns
//
//---
//
//Let me know if you want me to show how this works in memory using a small Java snippet or in a database schema with Hibernate annotations.
