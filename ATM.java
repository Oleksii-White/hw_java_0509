package org.example;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount N: ");
        int N = sc.nextInt();
        int days = 0;
        while (N > 0) {

            int maxDivisor = 1;
            for (int i = N - 1; i > 0; i--) {
                if (N % i == 0) {
                    maxDivisor = i;
                    break;
                }
            }
            N -= maxDivisor;
            days++;
        }

        System.out.println("Days to withdraw all money: " + days);
    }
    }

