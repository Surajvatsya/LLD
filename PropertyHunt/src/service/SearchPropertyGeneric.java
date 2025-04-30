package service;

import model.Property;
import model.builder.SearchClass;

import java.util.List;

public interface SearchPropertyGeneric {
    List<Property> search(SearchClass searchClass);
}
