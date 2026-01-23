package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_ArraysMaxMin_userinputs {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the Array-Size");
        int ArraySize = sc.nextInt();

        int[] Marks=new int[ArraySize];
        for(int i=0;i<ArraySize;i++){
            System.out.println("enter the number");
            Marks[i]=sc.nextInt();
        }

        System.out.println("----Here is the Array of numbers scanned as user input------------");
        for(int i=0;i<ArraySize;i++){
            System.out.println(Marks[i]);
        }
        sc.close();

        int max_output=give_me_max(Marks);
        System.out.println("maximum of marks is: " +max_output);

        int min_output=give_me_min(Marks);
        System.out.println("minimum of marks is: " +min_output);
    }
    private static int give_me_max(int[] scores) {

        int max=scores[0];
        for (int i=0;i<scores.length;i++){
            if(scores[i]>max) max=scores[i];
        }
        return max;
    }

    private static int give_me_min(int[] scores) {
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < min) min = scores[i];
        }
        return min;
    }
}

//in main method max[] array is declared however method scores[] is used in the actual methods. It works !!
//Short answer
//👉 Array name does NOT matter across methods.
//Only the reference (memory address) matters.