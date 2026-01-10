package ex_10_Loops;

import java.util.Scanner;

public class Lab109_Fibonacci {
    static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of terms: ");
                int n = scanner.nextInt();

                int first = 0;
                int second = 1;

                if (n >= 1) System.out.println(first);
                if (n >= 2) System.out.println(second);

                for (int i = 3; i <= n; i++) {
                    int sum = first + second;
                    System.out.println(sum);
                    first = second;
                    second = sum;
                }

                scanner.close();
            }
        }
