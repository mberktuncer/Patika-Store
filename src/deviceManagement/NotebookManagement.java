package deviceManagement;

import entity.brand.Brand;
import entity.devices.Notebook;
import store.PatikaStore;

import java.util.Scanner;

public class NotebookManagement implements Management{
    private static int notebookIdCounter = 1;
    @Override
    public void addDevice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Notebook infos:");

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

        System.out.print("RAM: ");
        int ram = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Storage: ");
        int storage = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Screen Size: ");
        double screenSize = scanner.nextDouble();

        scanner.close();

        Notebook notebook = new Notebook(notebookIdCounter, price, discountRate, stockQuantity, deviceName, brand,
                ram, storage, screenSize);
        notebookIdCounter +=1;

        PatikaStore.notebooks.add(notebook);
        System.out.println("Notebook added successfully.");

    }

    @Override
    public void listDeviceById(int id) {
        try{
            for (Notebook notebook : PatikaStore.notebooks){
                if (notebook.getId() == id){
                    System.out.println(notebook.toString());
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
            for (Notebook notebook : PatikaStore.notebooks){
                if (notebook.getDeviceName().equals(name)){
                    System.out.println(notebook.toString());
                }
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }

    @Override
    public void deleteDeviceByID(int id) {
        try{
            for (Notebook notebook : PatikaStore.notebooks){
                if (notebook.getId() == id){
                    System.out.println("Device deleted.");
                    PatikaStore.notebooks.remove(notebook);
                }
            }
        }
        catch (Exception e){
            System.out.println(e.toString());
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
