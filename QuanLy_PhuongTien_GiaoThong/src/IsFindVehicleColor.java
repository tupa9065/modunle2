public class IsFindVehicleColor implements IsFindVehicle{
    @Override
    public boolean find(Vehicle vehicle, String str) {
        return vehicle.getColor().equals(str);
    }
}
