package deviceManagement;

import entity.brand.Brand;
import entity.devices.Device;
import entity.devices.MobilePhone;

import java.util.ArrayList;

public interface Management {

    void addDevice();
    void listDeviceById(int id);
    void listDeviceByName(String name);
    void deleteDeviceByID(int id);
    Brand findBrandByName(String name);

}
