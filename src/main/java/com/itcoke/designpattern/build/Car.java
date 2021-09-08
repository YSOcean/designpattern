package com.itcoke.designpattern.build;

public class Car {
    // 车名称
    private String name;
    // 自动挡
    private String automaticCatch;
    // 手动挡
    private String manualTransmission;
    // 全景天窗
    private String panoramicSunroof;
    // 自动座椅
    private String automaticSeat;
    // 手动座椅
    private String manualSeat;
    // 倒车影像
    private String reversingImage;

    //省略get/set方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutomaticCatch() {
        return automaticCatch;
    }

    public void setAutomaticCatch(String automaticCatch) {
        this.automaticCatch = automaticCatch;
    }

    public String getManualTransmission() {
        return manualTransmission;
    }

    public void setManualTransmission(String manualTransmission) {
        this.manualTransmission = manualTransmission;
    }

    public String getPanoramicSunroof() {
        return panoramicSunroof;
    }

    public void setPanoramicSunroof(String panoramicSunroof) {
        this.panoramicSunroof = panoramicSunroof;
    }

    public String getAutomaticSeat() {
        return automaticSeat;
    }

    public void setAutomaticSeat(String automaticSeat) {
        this.automaticSeat = automaticSeat;
    }

    public String getManualSeat() {
        return manualSeat;
    }

    public void setManualSeat(String manualSeat) {
        this.manualSeat = manualSeat;
    }

    public String getReversingImage() {
        return reversingImage;
    }

    public void setReversingImage(String reversingImage) {
        this.reversingImage = reversingImage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", automaticCatch='" + automaticCatch + '\'' +
                ", manualTransmission='" + manualTransmission + '\'' +
                ", panoramicSunroof='" + panoramicSunroof + '\'' +
                ", automaticSeat='" + automaticSeat + '\'' +
                ", manualSeat='" + manualSeat + '\'' +
                ", reversingImage='" + reversingImage + '\'' +
                '}';
    }
}
