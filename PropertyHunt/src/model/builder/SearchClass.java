package model.builder;

import model.Address;
import model.PropertyType;

public class SearchClass {
    private Address location;
    private  Double minPrice;
    private  Double maxPrice;
    private  Double minSize;
    private  Double maxSize;
    private PropertyType  propertyType;
    private Boolean sortyByPrice;
    private Boolean sortyBySize;

    private SearchClass(Builder builder) {
        this.location = builder.location;
        this.minPrice = builder.minPrice;
        this.maxPrice = builder.maxPrice;
        this.minSize = builder.minSize;
        this.maxSize = builder.maxSize;
        this.propertyType = builder.propertyType;
        this.sortyByPrice = builder.sortyByPrice;
        this.sortyBySize = builder.sortyBySize;
    }

    public Address getLocation() {
        return location;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public Double getMinSize() {
        return minSize;
    }

    public Double getMaxSize() {
        return maxSize;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public Boolean getSortyByPrice() {
        return sortyByPrice;
    }

    public Boolean getSortyBySize() {
        return sortyBySize;
    }

    public static class Builder{
        private Address location;
        private  Double minPrice;
        private  Double maxPrice;
        private  Double minSize;
        private  Double maxSize;
        private PropertyType  propertyType;
        private Boolean sortyByPrice;
        private Boolean sortyBySize;

        public Builder setLocation(Address location) {
            this.location = location;
            return this;
        }

        public Builder setMinPrice(Double minPrice) {
            this.minPrice = minPrice;
            return this;
        }

        public Builder setMaxPrice(Double maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }

        public Builder setMinSize(Double minSize) {
            this.minSize = minSize;
            return this;
        }

        public Builder setMaxSize(Double maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        public Builder setPropertyType(PropertyType propertyType) {
            this.propertyType = propertyType;
            return this;
        }

        public Builder setSortyByPrice(Boolean sortyByPrice) {
            this.sortyByPrice = sortyByPrice;
            return this;
        }

        public Builder setSortyBySize(Boolean sortyBySize) {
            this.sortyBySize = sortyBySize;
            return this;
        }
        public SearchClass build(){
            return new SearchClass(this);
        }
    }


}
