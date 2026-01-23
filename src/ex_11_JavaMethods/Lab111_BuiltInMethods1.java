package ex_11_JavaMethods;
import java.util.*;
import java.time.*;

public class Lab111_BuiltInMethods1 {
    static void main(String[] args) {
        // ===============================
        // 1. Math Functions
        // ===============================
        System.out.println("Math Functions");
        System.out.println("Methods used: abs(), max(), random()");

        int mathInput1 = -5;
        int mathInput2 = 10;
        int mathInput3 = 20;

        System.out.println("Input: abs(" + mathInput1 + ")");
        System.out.println("Output: " + Math.abs(mathInput1));

        System.out.println("Input: max(" + mathInput2 + ", " + mathInput3 + ")");
        System.out.println("Output: " + Math.max(mathInput2, mathInput3));

        System.out.println("Input: random()");
        System.out.println("Output: " + Math.random());


        // ===============================
        // 2. String Functions
        // ===============================
        System.out.println("\nString Functions");
        System.out.println("Methods used: length(), contains()");

        String text = "Java Automation";

        System.out.println("Input String: \"" + text + "\"");
        System.out.println("Input: length()");
        System.out.println("Output: " + text.length());

        System.out.println("Input: contains(\"Java\")");
        System.out.println("Output: " + text.contains("Java"));


        // ===============================
        // 3. Array Functions
        // ===============================
        System.out.println("\nArray Functions");
        System.out.println("Methods used: Arrays.sort(), Arrays.toString()");

        int[] marks = {60, 90, 70};

        System.out.println("Input Array: [60, 90, 70]");
        java.util.Arrays.sort(marks);
        System.out.println("Output (Sorted Array): "
                + java.util.Arrays.toString(marks));


        // ===============================
        // 4. List Functions
        // ===============================
        System.out.println("\nList Functions");
        System.out.println("Methods used: add(), get()");

        java.util.List<String> browsers = new java.util.ArrayList<>();
        browsers.add("Chrome");
        browsers.add("Firefox");

        System.out.println("Input List: [Chrome, Firefox]");
        System.out.println("Input: get(0)");
        System.out.println("Output: " + browsers.get(0));


        // ===============================
        // 5. Map Functions
        // ===============================
        System.out.println("\nMap Functions");
        System.out.println("Methods used: put(), get()");

        java.util.Map<String, String> user = new java.util.HashMap<>();
        user.put("username", "admin");

        System.out.println("Input Map: {username=admin}");
        System.out.println("Input: get(\"username\")");
        System.out.println("Output: " + user.get("username"));


        // ===============================
        // 6. Date Function
        // ===============================
        System.out.println("\nDate Function");
        System.out.println("Method used: LocalDate.now()");

        System.out.println("Input: current system date");
        System.out.println("Output: " + java.time.LocalDate.now());


        // ===============================
        // 7. Object Functions
        // ===============================
        System.out.println("\nObject Functions");
        System.out.println("Methods used: equals(), toString()");

        String a = "Test";
        String b = "Test";

        System.out.println("Input: a = \"Test\", b = \"Test\"");
        System.out.println("Input: a.equals(b)");
        System.out.println("Output: " + a.equals(b));

        System.out.println("Input: a.toString()");
        System.out.println("Output: " + a.toString());
    }
}
