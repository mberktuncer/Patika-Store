import entity.brand.Brand;

import java.util.Set;
import java.util.TreeSet;

public class PatikaStore {

    private static Set<Brand> brands = new TreeSet<>();

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

    public static void printBrands(){
        for (Brand brand : brands){
            System.out.println(brand.toString());
        }
    }

    public static void main(String[] args) {

        PatikaStore.printBrands();

    }

}
