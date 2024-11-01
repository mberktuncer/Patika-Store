package entity.devices;

import entity.brand.Brand;

public class MobilePhone extends Device{

    private int memory;
    private double screenSize;
    private int battery;
    private int ram;
    private String colour;


    public MobilePhone(int id, double unitPrice, double discountRate, int stockQuantity, String deviceName, Brand brand,
                       int memory, double screenSize, int battery, int ram, String colour) {
        super(id, unitPrice, discountRate, stockQuantity, deviceName, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.battery = battery;
        this.ram = ram;
        this.colour = colour;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "memory=" + memory +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                ", ram=" + ram +
                ", colour='" + colour + '\'' +
                "} " + super.toString();
    }
}
