package model;

import java.time.LocalDateTime;
import java.util.List;

public class User extends IdAndTime {

    private String name;
    private String contact;
    private boolean isLoggedin;
    List<Property>shortlistedProperties;
    List<Property>listedProperty;


    public User(long id, String name, String contact) {
        super(id, LocalDateTime.now(), LocalDateTime.now());
        this.name = name;
        this.contact = contact;
    }

    void setShortlistedProperties(List<Property> shortlistedProperties){
        if(shortlistedProperties==null)
            this.shortlistedProperties = shortlistedProperties;
    }

    void setListedProperties(List<Property> listedProperties){
        if(listedProperties==null)
            this.listedProperty = listedProperties;
    }


    void addShortListedPropertirs(Property property){
        this.shortlistedProperties.add(property);
    }

    void addListedPropertirs(Property property){
        this.listedProperty.add(property);
    }

    public List<Property> getShortlistedProperties() {
        return shortlistedProperties;
    }

    public List<Property> getListedProperty() {
        return listedProperty;
    }

    public String getContact() {
        return contact;
    }



}
