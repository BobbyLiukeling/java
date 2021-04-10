package com.example.visual.model;

public class PVNumberAtSomeTime {
    private  String someTime;
    private  int exposedNum;
    private  int vaccinationNum;

    public PVNumberAtSomeTime(String someTime, int exposedNum, int vaccinationNum){
        this.someTime = someTime;
        this.exposedNum = exposedNum;
        this.vaccinationNum = vaccinationNum;
    }

    public PVNumberAtSomeTime(){
        super();
    }

    public String getSomeTime(){
        return someTime;
    }
    public void setSomeTime(String someTime){
        this.someTime = someTime;
    }

    public int getExposedNum(){
        return exposedNum;
    }

    public void setExposedNum(int exposedNum){
        this.exposedNum = exposedNum;
    }

    public int getVaccinationNum(){
        return vaccinationNum;
    }

    public void setVaccinationNum(int vaccinationNum) {
        this.vaccinationNum = vaccinationNum;
    }
}
