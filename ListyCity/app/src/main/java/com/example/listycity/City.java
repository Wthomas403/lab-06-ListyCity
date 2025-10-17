package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }

    public String getCity(){
        return city;
    }
    String getProvinceName(){
        return this.province;
    }

    /**
     * This method compares city objects base on their city name field
     * @param o the object to be compared.
     * @return 0, a positive number if a is greater, or a negative number if a is smaller.
     */
    @Override
    public int compareTo(City o) {

        return this.city.compareTo(o.getCity());
    }

    /**
     *
     * @param o the passed in object
     * @return true if the names and provinces are equal
     */
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City other = (City) o;
        return city.equals(other.city) && province.equals(other.province);
    }

    /**
     *
     * @return the hash of city and province
     */
    @Override
    public int hashCode(){
        return Objects.hash(city, province);
    }
}
