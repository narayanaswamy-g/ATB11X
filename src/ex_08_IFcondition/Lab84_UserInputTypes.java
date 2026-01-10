package ex_08_IFcondition;
import java.util.Scanner;

public class Lab84_UserInputTypes {
    static void main(String[] args) {

        //String browser = args[0];
        //System.out.println(browser);

        Scanner scanner =  new Scanner(System.in);
        String browser = scanner.next();

        switch (browser) {
            case "chrome":
                System.out.println("starting chrome . .");
                System.out.println(".............");
                System.out.println("TEST CASE - 1");
                System.out.println("all test cases executed successfully");
            case "firefox":
                System.out.println("starting firefox . .");
                System.out.println(".............");
                System.out.println("TEST CASE - 1");
                System.out.println("all test cases executed successfully");
            case "edge":
                System.out.println("starting edge . .");
                System.out.println(".............");
                System.out.println("TEST CASE - 1");
                System.out.println("all test cases executed successfully");
        }
    }
}
