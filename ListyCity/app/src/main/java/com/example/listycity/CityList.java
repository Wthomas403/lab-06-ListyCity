package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This method adds a city object to the cities list
     * @param city
     *          This is a city object we want to add to the list
     * @throws IllegalArgumentException if the city is already in the list
     */
    public void add(City city){
        if(cities.contains(city))
            throw new IllegalArgumentException();
        cities.add(city);
    }

    /**
     * Checks if cities has the passed city
     *
     * @param city the city that is being checked
     * @return ture if cities are equal false if not
     */

    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * Deletes the passed city if it is present in the cities list else throws exception
     *
     * @param city the city to be deleted
     * @throws IllegalArgumentException if city is not in the list
     */
    public void delete(City city){
        if (cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     *
     * @return the number of cities
     */
    public int countCities(){
        return cities.size();
    }

    /**
     * this method sorts the list of cities
     * @return
     *         a sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}
