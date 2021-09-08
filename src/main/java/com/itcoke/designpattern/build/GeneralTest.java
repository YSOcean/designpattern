package com.itcoke.designpattern.build;

public class GeneralTest {
    public Car getCarInstance(String carName){
        Car car = new Car();
        if("经典版".equals(carName)){
            car.setName("经典版");
            car.setManualTransmission("手动挡");
        }else if("舒适版".equals(carName)){
            car.setName("舒适版");
            car.setAutomaticCatch("自动挡");
            car.setManualSeat("手动座椅");
        }else if("豪华版".equals(carName)){
            car.setName("豪华版");
            car.setAutomaticCatch("自动挡");
            car.setAutomaticSeat("自动座椅");
            car.setReversingImage("倒车影像");
            car.setPanoramicSunroof("全景天窗");
        }else{
            throw new IllegalArgumentException("carName is error: carName="+carName);
        }
        return car;
    }
}
