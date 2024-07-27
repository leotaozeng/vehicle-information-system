package models;

import interfaces.CarVehicle;

public class Car implements CarVehicle {
    /**
     * @param doors - Number of doors
     */
    @Override
    public void setNumberOfDoors(int doors) {

    }

    /**
     * @return
     */
    @Override
    public int getNumberOfDoors() {
        return 0;
    }

    /**
     * @param fuel
     */
    @Override
    public void setFuelType(String fuel) {

    }

    /**
     * @return
     */
    @Override
    public String getFuelType() {
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
