package com.company.vehicles;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar() {
        super();
    }

    public SportCar(java.lang.String autoBrand, char autoClass, int autoWeight, int maxSpeed) {
        super(autoBrand, autoClass, autoWeight);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nМаксимальная скорость (км/ч) - " + getMaxSpeed();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
