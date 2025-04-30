package model;

import java.util.List;

public class CityCenter {
    public String cityName;
    public List<Center>centers;

    public CityCenter(String cityName, List<Center> centers) {
        this.cityName = cityName;
        this.centers = centers;
    }

    public String getCityName() {
        return cityName;
    }

    public List<Center> getCenters() {
        return centers;
    }


    public void addCenters(Center center) {
        this.centers.add(center);
    }
}
