package com.company;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        while (true) {
            if (login()) {
                break;
            }
            else {
                exit(0);
            }
        }
        getChoice();
    }

    public static String GetInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int GetInt(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public static boolean Getboolean(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextBoolean();
    }
    public static int[][] GetInt2d(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int[][] int2d = new int[scanner.nextInt()][scanner.nextInt()];
        return int2d;
    }

    public static double GetDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static boolean login() {
        login login = new login();
        login.setUsername(GetInput("Enter your username: "));
        login.setPassword(GetInput("Enter your password: "));
        if (login.getUsername().equals("admin") && login.getPassword().equals("admin")) {
            System.out.println("Welcome " + login.getUsername());
            return true;
        } else {
            System.out.println("Invalid username or password");
            return false;
        }
    }
    public static int getChoice() {
        int choice = GetInt("what category would you like to enter: 1: camera 2:monitor 3:PCHardware 4:Phones|");
        if (choice == 1) {
            cameras camera = new cameras();
            camera.setBrand(GetInput("Enter the brand of the camera: "));
            camera.setModel(GetInput("Enter the model of the camera: "));
            camera.setPrice(GetInt("Enter the price of the camera: "));
            camera.setQuantity(GetInt("Enter the quantity to be added: "));
            camera.setWeight(GetInt("Enter the weight of the camera: "));
            camera.setResolution(GetInt2d("Enter the resolution of the camera: "));
            camera.setMegapixels(GetDouble("Enter the megapixels of the camera: "));
            camera.setBattery(GetInt("Enter the battery capacity of the camera: "));
            camera.setMemory(GetInt("Enter the memory capacity of the camera: "));
            camera.setZoom(GetInt("Enter the zoom of the camera: "));
            camera.setFps(GetInt("Enter the fps of the camera: "));
            camera.setVideo(GetInput("Enter the video format of the camera: "));
            camera.setAudio(Getboolean("Enter the audio format of the camera: "));
            camera.setWifi(Getboolean("Enter the wifi of the camera: "));
            camera.setBluetooth(Getboolean("Enter the bluetooth of the camera: "));
            camera.setUsb(Getboolean("Enter the usb of the camera: "));
            camera.setSim(Getboolean("Enter the sim of the camera: "));
            camera.setBatteryType(GetInput("Enter the os of the camera: "));

            System.out.println("The camera you entered is: " + camera.toString());
            return choice;


        }
        return choice;
    }
}
