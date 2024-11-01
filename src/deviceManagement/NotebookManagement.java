package deviceManagement;

import entity.brand.Brand;
import entity.devices.Notebook;
import store.PatikaStore;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NotebookManagement implements Management{
    private static int notebookIdCounter = 1;

    @Override
    public void manage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                You are managing Notebooks.
                1- Add a new notebook
                2- List Notebook by Id
                3- List Notebook by Name
                4- Delete Notebook by Id
                5- Back to Main Menu
                """);
        int choice = scanner.nextInt();

        switch (choice){
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
                System.out.print("Enter the notebook name: ");
                String notebookName = scanner.nextLine();
                scanner.nextLine();
                listDeviceByName(notebookName);
                break;
            case 4:
                System.out.print("Enter the notebook id that you want to delete: ");
                int deleteId = scanner.nextInt();
                scanner.nextLine();
                deleteDeviceByID(deleteId);
                break;
            case 5:
                PatikaStore.patikaStoreManagementPanel();
                break;
            default:
                System.out.println("You entered invalid value !!!");
                break;
        }

        scanner.close();
    }

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
