package models;

import interfaces.TruckVehicle;

public class Truck implements TruckVehicle {
    /**
     * @param capacity
     */
    @Override
    public void setCargoCapacity(double capacity) {

    }

    /**
     * @return
     */
    @Override
    public double getCargoCapacity() {
        return 0;
    }

    /**
     * @param transmissionType
     */
    @Override
    public void setTransmissionType(String transmissionType) {

    }

    /**
     * @return
     */
    @Override
    public String getTransmissionType() {
        return "";
    }

    /**
     * @return
     */
    @Override
    public String getMake() {
        return "";
    }

    /**
     * @return
     */
    @Override
    public String getModel() {
        return "";
    }

    /**
     * @return
     */
    @Override
    public int getYear() {
        return 0;
    }
}
