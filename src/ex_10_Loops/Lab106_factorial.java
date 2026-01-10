package ex_10_Loops;
import java.util.Scanner;

public class Lab106_factorial {
    static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("WELCOME TO FACTORIAL GENERATION");
        int number = scanner.nextInt();

        int factorial=1;
        if (number<=0) {
            System.out.println(factorial);
        }
        else{
            for (int i=1;i<=number;i++){
            factorial=factorial*i;
            }
        }
        System.out.println("Factorial is -> "+ factorial);
    }
}
