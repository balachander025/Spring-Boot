package com.bala.two;

public class Myclass {
    private String brand;
    private String model;
    private int year;

    public Myclass(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Myclass() {
        this.brand="BMW";
        this.model="M3";
        this.year=2023;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
