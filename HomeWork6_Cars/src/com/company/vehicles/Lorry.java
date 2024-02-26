package com.company.vehicles;

public class Lorry extends Car{
    private int maxCargo;

    public Lorry(){
        super();
    }

    public Lorry(String autoBrand, char autoClass, int autoWeight, int maxCargo ){
        super(autoBrand, autoClass, autoWeight);
        this.maxCargo = maxCargo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nМаксимальная грузоподъемность (кг) - " + getMaxCargo();
    }

    public int getMaxCargo() {
        return maxCargo;
    }

    public void setMaxCargo(int maxCargo) {
        this.maxCargo = maxCargo;
    }
}
