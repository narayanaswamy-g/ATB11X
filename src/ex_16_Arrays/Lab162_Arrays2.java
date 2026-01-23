package ex_16_Arrays;

import java.util.Arrays;

public class Lab162_Arrays2 {
    public static void main(String[] args) {
        int[] marks={90,95,92,94,93,91};

        System.out.println("---printing values in marks array using for loop---------");
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("------------");
        //Using inbuilt Arrays class which defined array functions
        Arrays.sort(marks);
        System.out.println("SORTED MARKS");
        for(int i=0;i< marks.length;i++) System.out.println(marks[i]);
    }
}
