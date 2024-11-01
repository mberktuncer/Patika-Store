package store;

import entity.brand.Brand;
import entity.devices.MobilePhone;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class PatikaStore {

    public static Set<Brand> brands = new TreeSet<>();
    public static ArrayList<MobilePhone> mobilePhones = new ArrayList<>();

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
