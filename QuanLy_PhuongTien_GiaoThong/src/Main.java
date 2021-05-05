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
                                            System.out.println("lựa chọn không hợp lệ mời chọn lại");
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
                                System.out.println("lựa chọn không hợp lệ mời chọn lại");
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
                                System.out.println("nhập hãng sản xuất");
                                String str = scanner.nextLine();
                                List<Vehicle> newVehicles = vehicleManager.find(vehicles, new IsFindVehicleBrand(), str);
                                vehicleManager.showInfoVehicleList(newVehicles);
                                break;
                            }
                            case 2:{
                                System.out.println("nhập hãng mầu sắc");
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
                                System.out.println("lựa chọn không hợp lệ mời chọn lại");
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
        System.out.println("thoát chương trình");
        System.exit(0);
    }

    private static void findMenu() {
        System.out.println("Bạn muốn tìm kiếm theo");
        System.out.println("1. hãng sản xuất");
        System.out.println("2. mầu sắc");
        System.out.println("3. quay lại");
        System.out.println("0. thoát chương trình");
    }


    public static void showMenu() {
        System.out.println("1. Thêm phương tiện");
        System.out.println("2. Hiển thị tất cả phương tiện");
        System.out.println("3. Tìm kiếm phương tiện");
        System.out.println("4. Lưu danh sách phương tiện vào file");
        System.out.println("5. Lấy dữ liệu phương tiện từ file");
        System.out.println("0. Thoát");
        System.out.println("Nhập lựa chọn của bạn");
    }

    private static void showAddCarMenu() {
        System.out.println("Nhập loại ô tô muốn thêm");
        System.out.println("1. ô tô chở người");
        System.out.println("2. ô tô tải");
        System.out.println("3. quay lại");
        System.out.println("0. thoát chương trình");
    }

    private static void showAddVehicleMenu() {
        System.out.println("Nhập loại phương tiện muốn thêm");
        System.out.println("1. ô tô");
        System.out.println("2. xe máy");
        System.out.println("3. quay lại");
        System.out.println("0. thoát chương trình");
    }


}
