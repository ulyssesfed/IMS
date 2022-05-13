package com.company;

public class cameras extends stock{
    public String type = "camera";
    public String brand;
    public String model;
    public double price;
    public int quantity;
    public double weight;
    public int[][] resolution;
    public double megapixels;
    public int battery;
    public int memory;
    public int zoom;
    public int fps;
    public String video;
    public boolean audio;
    public boolean wifi;
    public boolean bluetooth;
    public boolean usb;
    public boolean sdcard;
    public boolean sim;
    public String batteryType;

    @Override
    public String toString() {
        return "cameras{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", weight=" + weight +
                ", resolution=" + resolution +
                ", megapixels=" + megapixels +
                ", battery=" + battery +
                ", memory=" + memory +
                ", zoom=" + zoom +
                ", fps=" + fps +
                ", video='" + video + '\'' +
                ", audio=" + audio +
                ", wifi=" + wifi +
                ", bluetooth=" + bluetooth +
                ", usb=" + usb +
                ", sdcard=" + sdcard +
                ", sim=" + sim +
                ", batteryType=" + batteryType +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = "camera";
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

    public double isPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int isQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double isWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int[][] getResolution() {
        return resolution;
    }

    public void setResolution(int[][] resolution) {
        this.resolution = resolution;
    }

    public double getMegapixels() {
        return megapixels;
    }

    public void setMegapixels(double megapixels) {
        this.megapixels = megapixels;
    }

    public int isBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int isMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int isZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    public int isFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public boolean getAudio() {
        return audio;
    }

    public void setAudio(boolean audio) {
        this.audio = audio;
    }

    public boolean getWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean getUsb() {
        return usb;
    }

    public void setUsb(boolean usb) {
        this.usb = usb;
    }

    public boolean getSdcard() {
        return sdcard;
    }

    public void setSdcard(boolean sdcard) {
        this.sdcard = sdcard;
    }

    public boolean getSim() {
        return sim;
    }

    public void setSim(boolean sim) {
        this.sim = sim;
    }

    public String isBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public cameras() {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
        this.resolution = resolution;
        this.megapixels = megapixels;
        this.battery = battery;
        this.memory = memory;
        this.zoom = zoom;
        this.fps = fps;
        this.video = video;
        this.audio = audio;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.usb = usb;
        this.sdcard = sdcard;
        this.sim = sim;
        this.batteryType = batteryType;

    }

    public void setName(String getInput) {
    }
}
