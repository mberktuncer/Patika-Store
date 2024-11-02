package deviceManagement;

import entity.brand.Brand;
import entity.devices.Device;
import entity.devices.MobilePhone;

import java.util.ArrayList;

public interface Management {
    void manage();
    void addDevice();
    void listAllDevice();
    void listDeviceById(int id);
    void listDeviceByName(String name);
    void deleteDeviceByID(int id);
    Brand findBrandByName(String name);

}
