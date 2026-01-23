package ex_11_JavaMethods;
/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; */

import java.util.*;
import java.time.*;

public class Lab111_BuiltInMethods2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("   JAVA BUILT-IN METHODS DEMO PROGRAM  ");
        System.out.println("======================================\n");

        // ===============================
        // 1️⃣ USER INPUT
        // ===============================
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("\nHello " + name + "! You are " + age + " years old.\n");


        // ===============================
        // 2️⃣ STRING METHODS
        // ===============================
        System.out.println("---- String Validation ----");
        System.out.print("Enter your preferred browser: ");
        String browser = sc.nextLine();

        if (browser.equals("Chrome")) {
            System.out.println("✔ Browser matched: Chrome");
        } else {
            System.out.println("✖ Browser not matched");
        }

        String pageTitle = "Login Page - Admin Panel";
        if (pageTitle.contains("Login")) {
            System.out.println("✔ Login page verified\n");
        }


        // ===============================
        // 3️⃣ MATH METHODS
        // ===============================
        System.out.println("---- Math Operations ----");
        int randomNumber = (int) (Math.random() * 10 + 1);
        System.out.println("Random number generated (1–10): " + randomNumber);

        int maxValue = Math.max(25, 40);
        System.out.println("Maximum of 25 and 40 is: " + maxValue + "\n");


        // ===============================
        // 4️⃣ ARRAYS
        // ===============================
        System.out.println("---- Array Operations ----");
        int[] scores = {75, 85, 60, 90};
        Arrays.sort(scores);
        System.out.println("Sorted scores: " + Arrays.toString(scores) + "\n");


        // ===============================
        // 5️⃣ LIST COLLECTION
        // ===============================
        System.out.println("---- List (Test Data) ----");
        List<String> browsers = new ArrayList<>();
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");

        System.out.println("Available browsers: " + browsers);
        System.out.println("First browser in list: " + browsers.get(0) + "\n");


        // ===============================
        // 6️⃣ MAP COLLECTION
        // ===============================
        System.out.println("---- Map (Credentials) ----");
        Map<String, String> credentials = new HashMap<>();
        credentials.put("username", "admin");
        credentials.put("password", "admin123");

        System.out.println("Stored username: " + credentials.get("username") + "\n");


        // ===============================
        // 7️⃣ DATE & TIME
        // ===============================
        System.out.println("---- Date & Time ----");
        System.out.println("Today's Date: " + LocalDate.now());
        System.out.println("Current Date & Time: " + LocalDateTime.now() + "\n");


        // ===============================
        // 8️⃣ OBJECT METHODS
        // ===============================
        System.out.println("---- Object Comparison ----");
        String s1 = new String("Test");
        String s2 = new String("Test");

        System.out.println("Are both objects equal? " + s1.equals(s2));
        System.out.println("Object value: " + s1.toString() + "\n");


        // ===============================
        // END
        // ===============================
        System.out.println("======================================");
        System.out.println("   PROGRAM EXECUTION COMPLETED 😊");
        System.out.println("======================================");

        sc.close();
    }
}
