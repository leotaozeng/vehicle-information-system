package models;

import interfaces.MotorVehicle;

public class Motorcycle implements MotorVehicle {
    private final String make;
    private final String model;
    private final int year;
    private int numberOfWheels;
    private String motorcycleType;

    // Create a class constructor for the Motorcycle class
    public Motorcycle(String make, String model, int year) {
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
    public int getYearOfManufacture() {
        return year;
    }

    /**
     * @param wheels - Number of wheels
     */
    @Override
    public void setNumberOfWheels(int wheels) {
        this.numberOfWheels = wheels;
    }

    /**
     * @return numberOfWheels
     */
    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    /**
     * @param motorcycleType - Type of motorcycle (sport, cruiser, or off-road)
     */
    @Override
    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    /**
     * @return motorcycleType
     */
    @Override
    public String getMotorcycleType() {
        return motorcycleType;
    }
}
