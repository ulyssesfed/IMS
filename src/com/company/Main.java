package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = GetInt("what category would you like to enter: 1: camera 2:monitor 3:PCHardware 4:Phones|");
        if (choice == 1) {
            cameras camera = new cameras();
            camera.setBrand(GetInput("Enter the brand of the camera: "));
            camera.setModel(GetInput("Enter the model of the camera: "));
            camera.setPrice(GetInt("Enter the price of the camera: "));
            camera.setQuantity(GetInt("Enter the quantity to be added: "));
            camera.setWeight(GetInt("Enter the weight of the camera: "));
            camera.setResolution(GetInt("Enter the resolution of the camera: "));
            camera.setMegapixels(GetDouble("Enter the megapixels of the camera: "));


        }


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
    public static double GetDouble(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}
