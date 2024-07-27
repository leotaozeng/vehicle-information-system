package models;

import interfaces.MotorVehicle;

public class Motorcycle implements MotorVehicle {

    /**
     * @param wheels
     */
    @Override
    public void setNumberOfWheels(int wheels) {

    }

    /**
     * @return
     */
    @Override
    public int getNumberOfWheels() {
        return 0;
    }

    /**
     * @param motorcycleType
     */
    @Override
    public void setMotorcycleType(String motorcycleType) {

    }

    /**
     * @return
     */
    @Override
    public String getMotorcycleType() {
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
