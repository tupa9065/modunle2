import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Vehicle> vehicles = new LinkedList<>();
        VehicleManager vehicleManager = new VehicleManager();
        vehicles= (LinkedList<Vehicle>) vehicleManager.getData();
        int choice = -1;
        do {
            showMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    int vehicleType = -1;
                    do {
                        showAddVehicleMenu();
                        vehicleType = Integer.parseInt(scanner.nextLine());
                        switch (vehicleType) {
                            case 1: {
                                int carType = -1;
                                do {
                                    showAddCarMenu();
                                    carType = Integer.parseInt(scanner.nextLine());
                                    switch (carType) {
                                        case 1: {
                                            Car car = new Car();
                                            vehicleManager.inputInfoCar(car);
                                            vehicles.add(car);
                                            break;
                                        }

                                        case 2: {
                                            Truck truck = new Truck();
                                            vehicleManager.inputInfoTruck(truck);
                                            vehicles.add(truck);
                                            break;
                                        }

                                        case 3: {
                                            break;
                                        }

                                        case 0: {
                                            exitProgram(vehicles, vehicleManager);
                                            break;
                                        }

                                        default: {
                                            System.out.println("l????a cho??n kh??ng h????p l???? m????i cho??n la??i");
                                            break;
                                        }

                                    }
                                } while (carType != 3);
                                break;
                            }

                            case 2: {
                                Motorcycle motorcycle = new Motorcycle();
                                vehicleManager.inputInfoMotorcycle(motorcycle);
                                vehicles.add(motorcycle);
                                break;
                            }
                            case 3:
                                break;
                            case 0: {
                                exitProgram(vehicles, vehicleManager);
                                break;
                            }

                            default: {
                                System.out.println("l????a cho??n kh??ng h????p l???? m????i cho??n la??i");
                                break;
                            }
                        }
                    } while (vehicleType != 3);

                    break;
                case 2:
                    vehicleManager.showInfoVehicleList(vehicles);
                    break;
                case 3:
                    int findSelect = -1;
                    do {
                        findMenu();
                        findSelect = Integer.parseInt(scanner.nextLine());
                        switch (findSelect) {
                            case 1: {
                                System.out.println("nh????p ha??ng sa??n xu????t");
                                String str = scanner.nextLine();
                                List<Vehicle> newVehicles = vehicleManager.find(vehicles, new IsFindVehicleBrand(), str);
                                vehicleManager.showInfoVehicleList(newVehicles);
                                break;
                            }
                            case 2:{
                                System.out.println("nh????p ha??ng m????u s????c");
                                String str = scanner.nextLine();
                                List<Vehicle> newVehicles = vehicleManager.find(vehicles, new IsFindVehicleColor(), str);
                                vehicleManager.showInfoVehicleList(newVehicles);
                                break;
                            }
                            case 3:
                                break;
                            case 0:{
                                exitProgram(vehicles, vehicleManager);

                                break;
                            }
                            default:
                                System.out.println("l????a cho??n kh??ng h????p l???? m????i cho??n la??i");
                                break;
                        }
                    } while (findSelect != 3);
                    break;
                case 4:{
                    vehicleManager.saveToFile(vehicles);
                    break;
                }

                case 5:{
                    vehicles = (LinkedList<Vehicle>) vehicleManager.getData();
                }
                    break;
                case 0:{
                    exitProgram(vehicles, vehicleManager);
                    break;
                }

                default:
                    break;

            }
        } while (choice != 0);

    }

    private static void exitProgram(LinkedList<Vehicle> vehicles, VehicleManager vehicleManager) {
        vehicleManager.saveToFile(vehicles);
        System.out.println("thoa??t ch????ng tri??nh");
        System.exit(0);
    }

    private static void findMenu() {
        System.out.println("Ba??n mu????n ti??m ki????m theo");
        System.out.println("1. ha??ng sa??n xu????t");
        System.out.println("2. m????u s????c");
        System.out.println("3. quay la??i");
        System.out.println("0. thoa??t ch????ng tri??nh");
    }


    public static void showMenu() {
        System.out.println("1. Th??m ph????ng ti????n");
        System.out.println("2. Hi????n thi?? t????t ca?? ph????ng ti????n");
        System.out.println("3. Ti??m ki????m ph????ng ti????n");
        System.out.println("4. L??u danh sa??ch ph????ng ti????n va??o file");
        System.out.println("5. L????y d???? li????u ph????ng ti????n t???? file");
        System.out.println("0. Thoa??t");
        System.out.println("Nh????p l????a cho??n cu??a ba??n");
    }

    private static void showAddCarMenu() {
        System.out.println("Nh????p loa??i ?? t?? mu????n th??m");
        System.out.println("1. ?? t?? ch???? ng??????i");
        System.out.println("2. ?? t?? ta??i");
        System.out.println("3. quay la??i");
        System.out.println("0. thoa??t ch????ng tri??nh");
    }

    private static void showAddVehicleMenu() {
        System.out.println("Nh????p loa??i ph????ng ti????n mu????n th??m");
        System.out.println("1. ?? t??");
        System.out.println("2. xe ma??y");
        System.out.println("3. quay la??i");
        System.out.println("0. thoa??t ch????ng tri??nh");
    }


}
