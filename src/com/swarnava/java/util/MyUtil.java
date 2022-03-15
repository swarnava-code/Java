package com.swarnava.java.util;

import javax.swing.*;
import java.util.Random;
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

    public void testJOptionPaneClass() {
        int dogLifeSpan = 13;
        String name = "";
        int age;
        float dogYear;
        try {
            dogLifeSpan = 13;
            name = JOptionPane.showInputDialog("Enter your name : ");
            age = Integer.parseInt(JOptionPane.showInputDialog("Hello, " + name + "\n Please, Enter your age : "));
            dogYear = (float) age / (float) dogLifeSpan;
            JOptionPane.showMessageDialog(null,
                    "Hello, " + name + "\n Your dog year is " + dogYear);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Sorry " + name + ", program failed, reason: " + e);
        }
    }

    public void testMathClass() {
        int a = 20;
        int b = -5;
        float f = 5.2514587f;
        double d = 5.415789658745878;

        double max = Math.max(b, f);
        int abs = Math.abs(b);
        double sqrt = Math.sqrt(a);
        double ceil = Math.ceil(f);
        double round = Math.round(f);
        double floor = Math.floor(f);

        System.out.println("Result{" +
                "max=" + max +
                ", abs=" + abs +
                ", sqrt=" + sqrt +
                ", ceil=" + ceil +
                ", round=" + round +
                ", floor=" + floor +
                '}');
    }

    public void testRandomClass() {
        Random random = new Random();
        boolean randBooleanValue = random.nextBoolean();
        int randomIntegerValue1 = random.nextInt();
        int randomIntegerValue2 = random.nextInt(900,920); // 900-919
        double randomDoubleValue = random.nextDouble();

        String randPhoneNo="";
        for (int i = 0; i <10; i++) {
            randPhoneNo += random.nextInt(0, 10);
        }

        System.out.println("randBooleanValue: " + randBooleanValue);
        System.out.println("randomIntegerValue1: " + randomIntegerValue1);
        System.out.println("randomIntegerValue2 (900-919): " + randomIntegerValue2);
        System.out.println("randomDoubleValue: " + randomDoubleValue);
        System.out.println("random phone no.: " + randPhoneNo);
    }

}
