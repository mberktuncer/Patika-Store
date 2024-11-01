package entity.devices;

import entity.brand.Brand;

public class Device {

    private int id;
    private double unitPrice;
    private double discountRate;
    private int stockQuantity;
    private String deviceName;
    Brand brand;

    public Device(int id, double unitPrice, double discountRate, int stockQuantity, String deviceName, Brand brand) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockQuantity = stockQuantity;
        this.deviceName = deviceName;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", unitPrice=" + unitPrice +
                ", discountRate=" + discountRate +
                ", stockQuantity=" + stockQuantity +
                ", deviceName='" + deviceName + '\'' +
                ", brand=" + brand.getName() +
                '}';
    }
}
