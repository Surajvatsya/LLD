package controller;

import model.Property;
import model.User;
import service.GenericProperty;

public class PropertyController {

    //attribute which is variable here genericProperty
    private GenericProperty genericProperty;
    public void createProperty(Property property){
        genericProperty.createProperty(property);
    }
    public Property getPropertyById(long id, User user){
        return genericProperty.getPropertyById(id,user);
    }
    public void deletepropertyById(long id, User user){
        genericProperty.deletepropertyById(id,user);
    }
}
