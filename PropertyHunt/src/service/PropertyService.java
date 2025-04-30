package service;

import model.Property;
import model.User;
import repository.PropertyReposetory;
import repository.UserSessionManager;

public class PropertyService implements GenericProperty{

    private PropertyReposetory propertyReposetory;
    private UserSessionManager userSessionManager;

    public PropertyService(PropertyReposetory propertyReposetory, UserSessionManager userSessionManager) {
        this.propertyReposetory = propertyReposetory;
        this.userSessionManager = userSessionManager;
    }

    @Override
    public void createProperty(Property property) {
        User user = property.getUser();

        if(userSessionManager.isLoggedIn(user.getContact()))
            propertyReposetory.addProperrty(property);
        else
            System.out.println("Invalid Credentials");
    }

    @Override
    public Property getPropertyById(long id, User user) {
        if(userSessionManager.isLoggedIn(user.getContact()))
            return propertyReposetory.getPropertyById(id);
        else{
            System.out.println("Invalid Credentials");
            return null;
        }
    }

    @Override
    public void deletepropertyById(long id, User user) {
        if(userSessionManager.isLoggedIn(user.getContact()))
         propertyReposetory.deleteProperty(id);
        else System.out.println("Invalid Credentials");
    }
}
