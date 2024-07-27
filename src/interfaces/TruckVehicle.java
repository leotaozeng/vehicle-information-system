package interfaces;

public interface TruckVehicle extends Vehicle {
    // interface methods
    void setCargoCapacity(double capacity);
    double getCargoCapacity();

    void setTransmissionType(String transmissionType);
    String getTransmissionType();
}
