package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String autoBrand;
    private char autoClass;
    private int autoWeight;
    Driver driver;
    Engine motor;

    public Car() {
    }

    public Car(String autoBrand, char autoClass, int autoWeight) {
        this.autoBrand = autoBrand;
        this.autoClass = autoClass;
        this.autoWeight = autoWeight;
    }

    public Car(String autoBrand, char autoClass, int autoWeight, Driver driver, Engine motor) {
        this.autoBrand = autoBrand;
        this.autoClass = autoClass;
        this.autoWeight = autoWeight;
        this.driver = driver;
        this.motor = motor;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String getAutoBrand() {
        return autoBrand;
    }

    public void setAutoBrand(String autoBrand) {
        this.autoBrand = autoBrand;
    }

    public char getAutoClass() {
        return autoClass;
    }

    public void setAutoClass(char autoClass) {
        this.autoClass = autoClass;
    }

    public int getAutoWeight() {
        return autoWeight;
    }

    public void setAutoWeight(int autoWeight) {
        this.autoWeight = autoWeight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    public String toString() {
        return  "\nВодитель:" +
                "\nФИО - " + driver.getFullName() +
                "\nСтаж вождения (лет) - " + driver.getDriveExp() +

                "\nАвтомобиль:" +
                "\nМарка - " + getAutoBrand() +
                "\nКласс - " + getAutoClass() +
                "\nВес (кг) - " + getAutoWeight() +

                "\nДвигатель:" +
                "\nМощность (л.с.) - " + motor.getPower() +
                "\nПроизводство - " + motor.getManufacture();

    }
}
