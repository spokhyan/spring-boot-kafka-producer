package com.skp.spring.model;



public class Customer {
    private String name;
    private String city;
    private long zipCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getZip() {
        return zipCode;
    }

    public void setZip(long zip) {
        this.zipCode = zip;
    }

    public Customer(String name, String city, long zip) {
        this.name= name;
        this.city=city;
        this.zipCode = zip;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zipCode +
                '}';
    }
}
