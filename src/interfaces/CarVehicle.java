package interfaces;

public interface CarVehicle extends Vehicle {
    // interface methods
    void setNumberOfDoors(int doors);
    int getNumberOfDoors();

    void setFuelType(String fuel);
    String getFuelType();
}
