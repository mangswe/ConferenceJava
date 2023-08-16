package com.pluralsight.model;

public class Speaker {
    private String firstname;
    private String lastname;
    private double seedNum;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSeedNum() {
        return seedNum;
    }

    public void setSeedNum(double seedNum) {
        this.seedNum = seedNum;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;



    }
}