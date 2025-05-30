package com.poc.immutable;

public class Address {
    private String city;
    private String zip;

    public Address(String city, String zip) {
        this.city = city;
        this.zip = zip;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
