package com.swarnava.java.util;

import java.util.Scanner;

public class MyUtil {

    public void testScannerClass() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Enter int val (a) : ");
        int a = scanner.nextInt();
        scanner.nextLine(); // remove '\n' from scanner

        System.out.println("Enter int val (b) : ");
        int b = scanner.nextInt();
        scanner.nextLine(); // remove '\n' from scanner

        System.out.println("Enter int val (c) : ");
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println("Hello, " + name);
        System.out.println("Multiplication result is = " + (a * b * c));
    }

}
