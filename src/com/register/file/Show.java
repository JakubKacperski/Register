package com.register.file;

import com.register.main.Print;

import java.io.File;

class Show {

    public static void showYears() {

        File yearsDirs = new File("Registers");

        File[] dirs = yearsDirs.listFiles();
        for (File dir : dirs != null ? dirs : new File[0]) {
            if (dir.isDirectory()) {
                System.out.print("Year ");
            } else {
                System.out.print("Register ");
            }
            try {
                System.out.println(dir.getName());
            } catch (Exception e) {
                Print.print("Error.");
            }
        }
    }


    public static void showRegisters(String year) {

        File registersDirs = new File("Registers/" + year);

        File[] dirs = registersDirs.listFiles();
        for (File dir : dirs != null ? dirs : new File[0]) {
            if (dir.isDirectory()) {
                System.out.print("Year ");
            } else {
                System.out.print("Register ");
            }
            try {
                System.out.println(dir.getName());
            } catch (Exception e) {
                Print.print("Error.");
            }
        }
    }


}
