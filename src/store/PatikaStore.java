package store;

import deviceManagement.MobilePhoneManagement;
import deviceManagement.NotebookManagement;
import entity.brand.Brand;
import entity.devices.MobilePhone;
import entity.devices.Notebook;

import java.sql.SQLOutput;
import java.util.*;

public class PatikaStore {

    public static Set<Brand> brands = new TreeSet<>();
    public static ArrayList<MobilePhone> mobilePhones = new ArrayList<>();
    public static ArrayList<Notebook> notebooks = new ArrayList<>();

    static {
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));
    }

    public PatikaStore() {
    }

    public static void patikaStoreManagementPanel(){

        NotebookManagement notebookManagement = new NotebookManagement();
        MobilePhoneManagement mobilePhoneManagement = new MobilePhoneManagement();
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Patika Store Product Management Panel !");
            System.out.println("""
                1- Notebook Management
                2- Mobile Phone Management
                3- List Brands
                0- Exit
                """);
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    notebookManagement.manage();
                    break;
                case 2:
                    mobilePhoneManagement.manage();
                    break;
                case 3:
                    printBrands();
                    patikaStoreManagementPanel();
                    break;
                case 0:
                    System.out.println("You closed the app");
                    break;
                default:
                    System.out.println("You entered invalid value !!!");
                    patikaStoreManagementPanel();
                    break;
            }
            scanner.close();

        }
        catch (InputMismatchException e){
            System.out.println("Please enter a valid choice");
        }


    }

    public static void printBrands(){
        for (Brand brand : brands){
            System.out.println(brand.toString());
        }
    }

    public static void printMobilePhones(){
        for (MobilePhone mobilePhone : mobilePhones){
            System.out.println(mobilePhone.toString());
        }
    }

}
