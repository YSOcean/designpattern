package com.itcoke.designpattern.build;

public class BuilderTest {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarConcreteBuilder();
        CarDirector carDirector = new CarDirector(carBuilder);
        Car classicCar = carDirector.classicConstruct();
        Car comfortableCar = carDirector.comfortableConstruct();
        System.out.println(classicCar);
        System.out.println(comfortableCar);
    }
}
