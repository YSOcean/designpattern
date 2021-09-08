package com.itcoke.designpattern.build;

public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public Car classicConstruct(){
        return carBuilder.buildClassic();
    }

    public Car comfortableConstruct(){
        return carBuilder.buildComfortable();
    }

    public Car luxuryConstruct(){
        return carBuilder.buildLuxury();
    }
}
