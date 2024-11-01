package deviceManagement;

import entity.brand.Brand;
import entity.devices.Device;
import entity.devices.MobilePhone;
import store.PatikaStore;


import java.util.Scanner;

public class MobilePhoneManagement implements Management{
    private static int mobilePhoneIdCounter = 1;

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

        scanner.close();

        MobilePhone phone = new MobilePhone(mobilePhoneIdCounter, price, discountRate, stockQuantity, deviceName, brand,
                memory, screenSize, battery, ram, colour);
        mobilePhoneIdCounter +=1;

        PatikaStore.mobilePhones.add(phone);
        System.out.println("Mobile Phone added successfully.");

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

    }

    @Override
    public void deleteDeviceByID(int id) {
        for (MobilePhone mobilePhone : PatikaStore.mobilePhones){
            if (mobilePhone.getId() == id){
                System.out.println("Device deleted.");
                PatikaStore.mobilePhones.remove(mobilePhone);
            }
        }
    }

    @Override
    public Brand findBrandByName(String name) {
        for (Brand brand : PatikaStore.brands) {
            if (brand.getName().equals(name)) {
                return brand;
            }
        }
        return null;
    }

}
