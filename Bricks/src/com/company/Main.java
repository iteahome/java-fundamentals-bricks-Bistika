package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, please input the total number of bricks_:");
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int i = 0;
        int m = n;
        while (n > 3*i) {
            i++;
            n = n - 3 * i;
        }
        if (n <= i/3) {
            System.out.println("Patlu placed the last brick.");
        }
        else {
            System.out.println("Motu placed the last brick.");
        }
    }
}
