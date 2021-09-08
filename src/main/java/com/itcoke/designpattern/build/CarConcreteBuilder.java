package com.itcoke.designpattern.build;

public class CarConcreteBuilder extends CarBuilder{

    @Override
    public Car buildClassic() {
        Car car = new Car();
        car.setName("经典版");
        car.setManualTransmission("手动挡");
        return car;
    }

    @Override
    public Car buildComfortable() {
        Car car = new Car();
        car.setName("舒适版");
        car.setAutomaticCatch("自动挡");
        car.setManualSeat("手动座椅");
        return car;
    }

    @Override
    public Car buildLuxury() {
        Car car = new Car();
        car.setName("豪华版");
        car.setAutomaticCatch("自动挡");
        car.setAutomaticSeat("自动座椅");
        car.setReversingImage("倒车影像");
        car.setPanoramicSunroof("全景天窗");
        return car;
    }
}
