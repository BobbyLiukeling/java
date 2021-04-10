package com.example.visual.model;

public class NumberForPerson {
    private int infant;
    private int children;
    private int teenager;
    private int youth;
    private int middleAge;
    private int agedness;
    private int male;
    private int female;

    public NumberForPerson(int infant, int children, int teenager, int youth, int middleAge, int agedness,
                           int male, int female){
        this.infant = infant;
        this.children = children;
        this.teenager = teenager;
        this.youth = youth;
        this.middleAge = middleAge;
        this.agedness = agedness;
        this.male = male;
        this.female = female;
    }

    public int getInfant(){
        return infant;
    }
    public void setInfant(int infant) {
        this.infant = infant;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getTeenager() {
        return teenager;
    }

    public void setTeenager(int teenager) {
        this.teenager = teenager;
    }

    public int getYouth() {
        return youth;
    }

    public void setYouth(int youth) {
        this.youth = youth;
    }

    public int getMiddleAge() {
        return middleAge;
    }

    public void setMiddleAge(int middleAge) {
        this.middleAge = middleAge;
    }

    public int getAgedness() {
        return agedness;
    }

    public void setAgedness(int agedness) {
        this.agedness = agedness;
    }

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }

    public int getFemale() {
        return female;
    }

    public void setFemale(int female) {
        this.female = female;
    }



}
