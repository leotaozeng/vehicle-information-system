package models;

import interfaces.CarVehicle;

public class Car implements CarVehicle {
    private String make;
    private String model;
    private int year;
    private int numberOfDoors;
    private String fuelType;

    // Create a class constructor for the Car class
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    /**
     * @return make - 车辆品牌
     */
    @Override
    public String getMake() {
        return make;
    }

    /**
     * @return model - 车辆模型
     */
    @Override
    public String getModel() {
        return model;
    }

    /**
     * @return year - 生产年份
     */
    @Override
    public int getYear() {
        return year;
    }

    /**
     * @param doors - Number of doors
     */
    @Override
    public void setNumberOfDoors(int doors) {
        this.numberOfDoors = doors;
    }

    /**
     * @return numberOfDoors
     */
    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * @param fuelType - Type of fuel (petrol, diesel, or electric)
     */
    @Override
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * @return fuelType
     */
    @Override
    public String getFuelType() {
        return fuelType;
    }
}
