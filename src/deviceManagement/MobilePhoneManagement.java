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
        System.out.println("Enter the phone infos: ");

        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Discount rate: ");
        double discountRate = scanner.nextDouble();
        System.out.print("Stock Quantity: ");
        int stockQuantity = scanner.nextInt();
        System.out.print("Mobile Phone Name: ");
        String deviceName = scanner.nextLine();
        System.out.print("Brand: ");
        Brand brand = findBrandByName(scanner.next());
        System.out.print("Memory: ");
        int memory = scanner.nextInt();
        System.out.print("Screen Size: ");
        double screenSize = scanner.nextDouble();
        System.out.print("Battery: ");
        int battery = scanner.nextInt();
        System.out.print("RAM: ");
        int ram = scanner.nextInt();
        System.out.print("Colour: ");
        String colour = scanner.nextLine();

        MobilePhone phone = new MobilePhone(mobilePhoneIdCounter, price, discountRate, stockQuantity, deviceName, brand,
                memory, screenSize, battery, ram, colour);
        mobilePhoneIdCounter +=1;

        PatikaStore.mobilePhones.add(phone);

    }

    @Override
    public void listDeviceById(int id) {
        for (MobilePhone mobilePhone : PatikaStore.mobilePhones){
            if (mobilePhone.getId() == id){
                System.out.println(mobilePhone.toString());
            }
        }
    }

    @Override
    public void listDeviceByName(String name) {
        for (MobilePhone mobilePhone : PatikaStore.mobilePhones){
            if (mobilePhone.getDeviceName().equals(name)){
                System.out.println(mobilePhone.toString());
            }
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
