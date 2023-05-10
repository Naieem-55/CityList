package com.example.citylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     * @param city
     * This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * retyrn the sorted list of cityList
     * @param param
     * @return cityList
     */
    public List<City> getCities(int param) {
        List<City> cityList = cities;

        if(param == 1){
            Collections.sort(cityList);
        }
        else{
            Collections.sort(cityList, new Comparator<City>() {
                @Override
                public int compare(City city, City t1) {
                    return city.getProvinceName().compareTo(t1.getProvinceName());
                }
            });
        }
        return cityList;
    }

    /**
     *
     * @param city
     * checking if the city exists or not
     * if not exists throw an illegal Exception
     */

    public void delete(City city){
        if(!cities.contains(city)){
            throw new IllegalArgumentException();
        }
        else {
            cities.remove(city);
        }
    }

    /**
     * This method is used to count the total size of list
     * @return item count returns size of cities list
     */

    public int count(){
        return cities.size();
    }
}
