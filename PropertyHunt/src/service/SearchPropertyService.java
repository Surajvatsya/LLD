package service;

import model.Property;
import model.builder.SearchClass;
import repository.PropertyReposetory;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SearchPropertyService implements SearchPropertyGeneric {

//    private Boolean comparator(Property p1, Property p2){
//        return p1.getPrice() < p2.getPrice();
//    }

    private int compareByPrice(Property p1, Property p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }

    private int compareBySize(Property p1, Property p2) {
        return Double.compare(p1.getPropertySize(), p2.getPropertySize());
    }

    PropertyReposetory propertyReposetory;
    @Override
    public List<Property> search(SearchClass searchClass) {
        List<Property> propertyList = propertyReposetory.getAllProperties();
        List<Property> filteredPropertLists=  propertyList.stream().filter(property -> searchClass.getLocation()==null || searchClass.getLocation().equals(property.getAddress()))
                .filter(property -> searchClass.getMaxPrice()==null || searchClass.getMaxPrice() >= property.getPrice())
                .filter(property -> searchClass.getMinPrice()==null || searchClass.getMinPrice() <= property.getPrice())
                .filter(property -> searchClass.getPropertyType()==null || searchClass.getPropertyType() == property.getPropertyType())
                .filter(property -> searchClass.getMaxSize()==null || searchClass.getMaxSize() >= property.getPropertySize())
                .filter(property -> searchClass.getMinSize()==null || searchClass.getMinSize() <= property.getPropertySize())
                .collect(Collectors.toList());

        if(searchClass.getSortyByPrice()){

            //method refernce to curr object -> learn it
            filteredPropertLists.sort(this::compareByPrice);
        }

        if(searchClass.getSortyBySize()){

            //method refernce to curr object -> learn it
            filteredPropertLists.sort(this::compareBySize);
        }

        return filteredPropertLists;

    }
}
