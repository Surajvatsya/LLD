package repository;

import model.Property;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PropertyReposetoryHashMap implements PropertyReposetory{

    private HashMap<Long,Property> propertyHashMap = new HashMap<>();

    @Override
    public void addProperrty(Property property) {
        propertyHashMap.put(property.getId(),property);
    }

    @Override
    public void deleteProperty(long id) {
        propertyHashMap.remove(id);
    }

    @Override
    public Property getPropertyById(long id) {
        return propertyHashMap.get(id);
    }

    @Override
    public List<Property> getAllProperties() {
        List<Property> propertyList = new ArrayList<>();
        for(Property property : propertyHashMap.values()){
            if(property.isAvailable())
                propertyList.add(property);
        }
        return propertyList;
    }
}
