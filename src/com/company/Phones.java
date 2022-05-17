package com.company;

public class Phones extends stock{
    private String type = "Phones";
    private String brand;
    private String model;
    private int price;
    private int quantity;
    public double megaPixels;
    public int storage;
    public String color;
    public String OS;
    public int cameras;

    @Override
    public String toString() {
        return "Phones{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", megaPixels=" + megaPixels +
                ", storage=" + storage +
                ", color='" + color + '\'' +
                ", OS='" + OS + '\'' +
                ", cameras=" + cameras +
                '}';
    }

    public Phones() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(double megaPixels) {
        this.megaPixels = megaPixels;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getCameras() {
        return cameras;
    }

    public void setCameras(int cameras) {
        this.cameras = cameras;
    }

    public Phones(String type, String brand, String model, int price, int quantity, double megaPixels, int storage, String color, String OS, int cameras) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
        this.megaPixels = megaPixels;
        this.storage = storage;
        this.color = color;
        this.OS = OS;
        this.cameras = cameras;
    }
}
