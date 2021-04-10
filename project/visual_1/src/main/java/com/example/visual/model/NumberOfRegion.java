package com.example.visual.model;

public class NumberOfRegion {
    private String region;
    private int number;

    public NumberOfRegion(String region, int number) {
        this.region = region;
        this.number = number;
    }

    public NumberOfRegion() {
        super();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
