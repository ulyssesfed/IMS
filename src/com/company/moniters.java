package com.company;

public class moniters extends stock {
    private final String type = "monitor";
    protected String brand;
    private String model;
    private int resolutionX;
    private int resolutionY;
    private int refreshRate;
    private int brightness;
    private int contrast;
    private int color;
    private int weight;
    private int price;
    private int quantity;

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

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getContrast() {
        return contrast;
    }

    public void setContrast(int contrast) {
        this.contrast = contrast;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public moniters() {
        this.brand = brand;
        this.model = model;
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
        this.refreshRate = refreshRate;
        this.brightness = brightness;
        this.contrast = contrast;
        this.color = color;
        this.weight = weight;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "moniters{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                ", refreshRate=" + refreshRate +
                ", brightness=" + brightness +
                ", contrast=" + contrast +
                ", color=" + color +
                ", weight=" + weight +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
