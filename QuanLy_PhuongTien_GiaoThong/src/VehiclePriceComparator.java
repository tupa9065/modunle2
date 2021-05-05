public class VehiclePriceComparator implements VehicleComparator{

    @Override
    public int compare(Vehicle vehicle1, Vehicle vehicle2) {
        return vehicle1.getPrice()-vehicle2.getPrice() ;
    }
}
