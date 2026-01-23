package ex_14_Strings;

import java.util.Scanner;

public class Lab144_FindPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string, I will check Palindrome");

        String userInput = sc.next();
        String newString = reverseString(userInput);

        if (newString.equalsIgnoreCase(userInput)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT A PALINDROME");
            //madam - naman - rotavator
            // this program fails for 'never odd or even' -> try string builder reverse
        }

        sc.close();
    }

    private static String reverseString(String userInput) {
        String reversed = "";

        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversed = reversed + userInput.charAt(i);
        }

        return reversed;
    }
}
