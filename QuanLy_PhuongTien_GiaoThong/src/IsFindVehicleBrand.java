public class IsFindVehicleBrand implements IsFindVehicle {
    @Override
    public boolean find(Vehicle vehicle, String str) {
        return vehicle.getBrand().equals(str);
    }
}
