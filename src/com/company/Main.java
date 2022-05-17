package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static cameras camera = new cameras();
    static moniters moniters = new moniters();
    static Phones phones = new Phones();
    static File file = new File("1.txt"); //file for camera
    static File MFile = new File("2.txt"); //file for moniters
    static File PFile = new File("3.txt"); //file for phones


    public static void main(String[] args) throws IOException {
        login.userArray();
        while (true) { // while loop to check if the user is logged in before starting the program
            if (login()) {
                break; // if the user is logged in, break the loop
            } else {
                exit(0); // if the user is not logged in, exit the program
            }
        }
        // if the user is logged in, start the program
        do {

            writeToFile(getChoice());
            boolean exit = Getboolean("Do you want to exit? (y/n)");
            if (exit) {
                break;
            }
        } while (true); // do while loop to check if the user wants to exit the program
    }

    public static String GetInput(String prompt) { // method to get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    } // end of GetInput

    public static int GetInt(String prompt) { // method to get an integer from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    } // method to get a boolean from the user

    public static boolean Getboolean(String prompt) { // method to get a boolean from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        if (scanner.nextLine().equals("y")) {
            return true;
        }
        return false;
    }// method to get a boolean from the user

    public static int[][] GetInt2d(String prompt) { // method to get a 2d array from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int[][] int2d = new int[scanner.nextInt()][scanner.nextInt()];
        return int2d;
    }// method to get a 2d array from the user

    public static double GetDouble(String prompt) { // method to get a double from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    } // method to get a double from the user

    public static boolean login() throws IOException { // method to check if the user is logged in
        login login = new login();
        String acc = GetInput("do you need to create an account? (y/n)");// if the user wants to create an account
        if (acc.equals("y")) {
            login.setUsername(GetInput("username: "));
            login.setPassword(GetInput("password: "));
            login.fileWriter(login.getUsername(), login.getPassword());
            login.userArray();
        }
        login.setUsername(GetInput("Enter your username: "));
        login.setPassword(GetInput("Enter your password: "));
        if (login.getUsername().equals("admin") && login.getPassword().equals("admin")) {
            System.out.println("Welcome " + login.getUsername());
            return true;
        } else if (login.checkUser(login.getUsername(), login.getPassword())) {
            System.out.println("Welcome " + login.getUsername()); // if the user is logged in, print the username
            return true;
        } else {
            System.out.println("Invalid username or password");
            return false;

        } // if the user is not logged in, print invalid username or password


    }

    public static int getChoice() throws IOException {  // method to get the user's choice
        int choice = GetInt("what category would you like to enter: 1: camera 2:monitor 3:PCHardware 4:Phones|");
        if (choice == 1) {
            try {
                camera.setBrand(GetInput("Enter the brand of the camera: "));
                camera.setModel(GetInput("Enter the model of the camera: "));
                camera.setPrice(GetInt("Enter the price of the camera: "));
                camera.setQuantity(GetInt("Enter the quantity to be added: "));
                camera.setWeight(GetInt("Enter the weight of the camera: "));
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
            } catch (Exception e) {
                System.out.println("Invalid input");
            }


            System.out.println("The camera you entered is: " + camera.toString());
            return choice;


        }//end of camera
        if (choice == 2) {
            try {


                moniters.setBrand(GetInput("Enter the brand of the monitor: "));
                moniters.setModel(GetInput("Enter the model of the monitor: "));
                moniters.setPrice(GetInt("Enter the price of the monitor: "));
                moniters.setQuantity(GetInt("Enter the quantity to be added: "));
                moniters.setWeight(GetInt("Enter the weight of the monitor: "));
                moniters.setResolutionX(GetInt("Enter the resolution of the monitor: "));
                moniters.setResolutionY(GetInt("Enter the resolution of the monitor: "));
                moniters.setRefreshRate(GetInt("Enter the resolution of the monitor: "));
                moniters.setBrightness(GetInt("Enter the display type of the monitor: "));
                moniters.setContrast(GetInt("Enter the contrast of the monitor: "));
                moniters.setColor(GetInt("Enter the aspect ratio of the monitor: "));
            } catch (Exception e) {
                System.out.println("Invalid input");
            }

            System.out.println("The monitor you entered is: " + moniters.toString());

        }//end of monitor
        if (choice == 3) {

        }
        if (choice == 4) {
            try {
                phones.setBrand(GetInput("Enter the brand of the phone: "));
                phones.setModel(GetInput("Enter the model of the phone: "));
                phones.setPrice(GetInt("Enter the price of the phone: "));
                phones.setQuantity(GetInt("Enter the quantity to be added: "));
                phones.setMegaPixels(GetInt("Enter the megapixels of the phone: "));
                phones.setStorage(GetInt("Enter the storage of the phone: "));
                phones.setColor(GetInput("Enter the color of the phone: "));
                phones.setOS(GetInput("Enter the os of the phone: "));
                phones.setCameras(GetInt("Enter the cameras of the phone: "));
            } catch (Exception e) {
                System.out.println("Invalid input");
            }

            System.out.println("The phone you entered is: " + phones.toString());
        }
        return choice; // return the user's choice
    }

    public static void writeToFile(int choice) throws IOException { // method to write to the file
        boolean check = Getboolean("Would you like to add this to the record(y/n)"); // check if the user wants to add the product to the record
        if (choice == 1) {// if the user chose to add a camera
            if (check) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
                writer.write(camera.toString());
                writer.newLine();
                writer.close();
            }
        }
        if (choice == 2) { // if the user chose to add a monitor
            if (check) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(MFile, true));
                writer.write(moniters.toString());
                writer.newLine();
                writer.close();
            }
        }
        if (choice == 4) {// if the user chose to add a phone
            if (check) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(PFile, true));
                writer.write(phones.toString());
                writer.newLine();
                writer.close();
            }
        }


    }
}
