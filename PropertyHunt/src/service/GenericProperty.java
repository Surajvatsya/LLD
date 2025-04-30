package service;

import model.Property;
import model.User;

public interface GenericProperty {
    void createProperty(Property property);
    Property getPropertyById(long id, User user);
    void deletepropertyById(long id, User user);
}
