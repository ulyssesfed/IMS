package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class login {
    static File file = new File("user.txt");

    static ArrayList<String> user = new ArrayList<>();

    protected String username;
    protected String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void fileWriter(String username, String password) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(username + " " + password);
            writer.newLine();
        }
    }

    public static void userArray() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                user.add(line);
            }
        }
    }

    public static boolean checkUser(String username, String password) {

        return user.contains(username + " " + password);
    }
}
