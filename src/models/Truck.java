package models;

import interfaces.TruckVehicle;

public class Truck implements TruckVehicle {
    private String make;
    private String model;
    private int year;
    private double cargoCapacity;
    private String transmissionType;

    // Create a class constructor for the Truck class
    public Truck(String make, String model, int year) {
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
     * @param capacity - Cargo capacity (in tons)
     */
    @Override
    public void setCargoCapacity(double capacity) {
        this.cargoCapacity = capacity;
    }

    /**
     * @return cargoCapacity
     */
    @Override
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    /**
     * @param transmissionType - Type of transmission (manual or automatic)
     */
    @Override
    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    /**
     * @return transmissionType
     */
    @Override
    public String getTransmissionType() {
        return transmissionType;
    }
}
