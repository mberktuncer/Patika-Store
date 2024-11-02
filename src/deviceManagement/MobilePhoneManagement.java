package deviceManagement;

import entity.brand.Brand;
import entity.devices.MobilePhone;
import entity.devices.Notebook;
import store.PatikaStore;


import java.util.Scanner;

public class MobilePhoneManagement implements Management{
    private static int mobilePhoneIdCounter = 1;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void manage() {

        System.out.println("""
                You are managing Mobile Phones.
                1- Add a new Mobile Phone
                2- List Mobile Phone by Id
                3- List Mobile Phone by Name
                4- Delete Mobile Phone by Id
                5- List All Mobile Phones
                6- Back to Main Menu
                """);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addDevice();
                break;
            case 2:
                System.out.print("Enter the id number: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                listDeviceById(id);
                break;
            case 3:
                System.out.print("Enter the Mobile Phone name: ");
                String notebookName = scanner.nextLine();
                scanner.nextLine();
                listDeviceByName(notebookName);
                break;
            case 4:
                System.out.print("Enter the Mobile Phone id that you want to delete: ");
                int deleteId = scanner.nextInt();
                scanner.nextLine();
                deleteDeviceByID(deleteId);
                break;
            case 5:
                listAllDevice();
                break;
            case 6:
                PatikaStore.patikaStoreManagementPanel();
                break;
            default:
                System.out.println("You entered invalid value !!!");
                break;
        }

    }

    @Override
    public void addDevice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Mobile Phone infos:");

        System.out.print("Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Discount rate: ");
        double discountRate = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Stock Quantity: ");
        int stockQuantity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Mobile Phone Name: ");
        String deviceName = scanner.nextLine();

        System.out.print("Brand: ");
        Brand brand = findBrandByName(scanner.nextLine());

        System.out.print("Memory: ");
        int memory = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Screen Size: ");
        double screenSize = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Battery: ");
        int battery = scanner.nextInt();
        scanner.nextLine();

        System.out.print("RAM: ");
        int ram = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Colour: ");
        String colour = scanner.nextLine();

        MobilePhone phone = new MobilePhone(mobilePhoneIdCounter, price, discountRate, stockQuantity, deviceName, brand,
                memory, screenSize, battery, ram, colour);
        mobilePhoneIdCounter +=1;

        PatikaStore.mobilePhones.add(phone);
        System.out.println("Mobile Phone added successfully.");

        manage();

    }

    @Override
    public void listAllDevice() {
        try{
            System.out.println("Mobile Phone List");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.printf("| %-2s | %-30s | %-9s | %-10s | %-10s | %-9s | %-9s | %-9s | %-9s |\n",
                    "ID", "Product Name", "Price", "Brand", "Memory", "Screen Size", "RAM", "Stock", "Colour");
            System.out.println("----------------------------------------------------------------------------------------------------");

            for (MobilePhone mobilePhone : PatikaStore.mobilePhones) {
                System.out.printf("| %-2d | %-30s | %-9.1f | %-10s | %-10d | %-9.1f | %-9d | %-9s | %-9s |\n",
                        mobilePhone.getId(), mobilePhone.getDeviceName(), mobilePhone.getUnitPrice(), mobilePhone.getBrand().getName(),
                        mobilePhone.getMemory(), mobilePhone.getScreenSize(), mobilePhone.getRam(), mobilePhone.getStockQuantity(), mobilePhone .getColour());
            }

            System.out.println("----------------------------------------------------------------------------------------------------");
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        manage();
    }

    @Override
    public void listDeviceById(int id) {
        try{
            for (MobilePhone mobilePhone : PatikaStore.mobilePhones){
                if (mobilePhone.getId() == id){
                    System.out.println(mobilePhone.toString());
                }
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        manage();

    }

    @Override
    public void listDeviceByName(String name) {
        try{
            for (MobilePhone mobilePhone : PatikaStore.mobilePhones){
                if (mobilePhone.getDeviceName().equals(name)){
                    System.out.println(mobilePhone.toString());
                }
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

        manage();

    }

    @Override
    public void deleteDeviceByID(int id) {
        for (MobilePhone mobilePhone : PatikaStore.mobilePhones){
            if (mobilePhone.getId() == id){
                System.out.println("Device deleted.");
                PatikaStore.mobilePhones.remove(mobilePhone);
            }
        }

        manage();

    }

    @Override
    public Brand findBrandByName(String name) {
        for (Brand brand : PatikaStore.brands) {
            if (brand.getName().equals(name)) {
                return brand;
            }
        }
        return new Brand(0, "Not Found Brand");

    }

}
