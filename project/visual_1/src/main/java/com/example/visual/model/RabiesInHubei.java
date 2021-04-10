package com.example.visual.model;

//RabiesInHubei对象类
public class RabiesInHubei {
    private String city;
    private String year;
    private int infected;
    private int exposed;

    public RabiesInHubei(String city, String year, int infected, int exposed) {
        this.city = city;
        this.year = year;
        this.infected = infected;
        this.exposed = exposed;
    }

    public RabiesInHubei() {
        super();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getInfected() {
        return infected;
    }

    public void setInfected(int infected) {
        this.infected = infected;
    }

    public int getExposed() {
        return exposed;
    }

    public void setExposed(int exposed) {
        this.exposed = exposed;
    }
}
