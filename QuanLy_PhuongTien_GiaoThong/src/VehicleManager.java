import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class VehicleManager {
     Scanner scanner = new Scanner(System.in);

    public   void inputInfoVehicle(Vehicle vehicle) {
        System.out.println("Nhập hãng sản xuât");
        String brand=scanner.nextLine();

        System.out.println("Nhập năm sản xuất");
        int yearOfManufacture=Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập giá bán");
        int price=Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập mầu sắc");
        String color = scanner.nextLine();

        vehicle.setBrand(brand);
        vehicle.setYearOfManufacture(yearOfManufacture);
        vehicle.setPrice(price);
        vehicle.setColor(color);
    }

    public   void inputInfoCar(Car car) {
        inputInfoVehicle(car);

        System.out.println("Nhập loại động cơ");
        String engineType=scanner.nextLine();

        System.out.println("Nhập số ghế ngồi");
        int numOfSeats = Integer.parseInt(scanner.nextLine());

        car.setEngineType(engineType);
        car.setNumOfSeats(numOfSeats);

    }
    public   void inputInfoTruck(Truck truck) {
        inputInfoCar(truck);
        System.out.println("Nhập trọng tải ");
        int grossTon = Integer.parseInt(scanner.nextLine());
        truck.setGrossTon(grossTon);
    }
    public   void inputInfoMotorcycle(Motorcycle motorcycle) {
        inputInfoVehicle(motorcycle);
        System.out.println("Nhập công xuất động cơ ");
        int capacity = Integer.parseInt(scanner.nextLine());
        motorcycle.setCapacity(capacity);
    }
    public   void showInfoVehicleList(List<Vehicle> vehicles) {
        for (Vehicle vehicle:vehicles) {
            System.out.println(vehicle);
        }
    }

    public List sort(List<Vehicle> vehicleList,VehicleComparator vehicleComparator) {
        for (int i = 0; i<vehicleList.size()-1;i++) {
            for (int j = i+1; j < vehicleList.size(); j++) {
                if(vehicleComparator.compare(vehicleList.get(i),vehicleList.get(j))>0){
                    Collections.swap(vehicleList,i,j);
                }
            }

        }
        return vehicleList;
    }

    public List<Vehicle> find(LinkedList<Vehicle> vehicles,IsFindVehicle isFindVehicle ,String str) {
        List<Vehicle> newVehicles = new LinkedList<>();
        for (Vehicle element : vehicles) {
            if(isFindVehicle.find(element,str)){
                newVehicles.add(element);
            }
        }
        return newVehicles;
    }

    public void saveToFile(LinkedList<Vehicle> vehicles) {
        try {
            FileOutputStream fos = new FileOutputStream("vehicles.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(vehicles);
            oos.close();
            fos.close();
            System.out.println("saved successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Vehicle> getData() {
        List<Vehicle> newVehicles = new LinkedList<>();
        try {
            FileInputStream fis=new FileInputStream("vehicles.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            newVehicles = (List<Vehicle>) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("get data  successfully");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newVehicles;
    }
}
