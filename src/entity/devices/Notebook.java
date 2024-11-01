package entity.devices;

import entity.brand.Brand;


public class Notebook extends Device{

    private int ram;
    private int storage;
    private double screenSize;

    public Notebook(int id, double unitPrice, double discountRate, int stockQuantity, String deviceName, Brand brand,
                    int ram, int storage, double screenSize) {
        super(id, unitPrice, discountRate, stockQuantity, deviceName, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
