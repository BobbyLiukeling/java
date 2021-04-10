package com.example.visual.model;

public class NumberAtSomeTime {
    private String someTime;
    private int number;

    public NumberAtSomeTime(String someTime, int number) {
        this.someTime = someTime;
        this.number = number;
    }

    public NumberAtSomeTime() {
        super();
    }

    public String getSomeTime() {
        return someTime;
    }

    public void setSomeTime(String someTime) {
        this.someTime = someTime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
