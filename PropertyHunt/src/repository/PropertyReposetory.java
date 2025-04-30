package repository;

import model.Property;

import java.util.List;

public interface PropertyReposetory {
    void addProperrty(Property property);
    void deleteProperty(long id);
    Property getPropertyById(long id);
    List<Property> getAllProperties ();


}
