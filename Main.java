package org.example;
public class Main {
    public static void main(String[] args) {
        double temperature1 = 120.5;
        double temperature2 = 80.0;

        boolean workingCorrectly = checkBottle(temperature1, temperature2);
        System.out.println("Device is working correctly: " + workingCorrectly);
    }
    public static boolean checkBottle(double temperature1, double temperature2) {
        return (temperature1 > 100 && temperature2 < 100);
    }

}