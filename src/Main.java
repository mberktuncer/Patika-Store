import deviceManagement.MobilePhoneManagement;
import store.PatikaStore;


public class Main {

    public static void main(String[] args) {

        PatikaStore.printBrands();
        MobilePhoneManagement manage = new MobilePhoneManagement();
        manage.addDevice();
        PatikaStore.printMobilePhones();


    }

}
