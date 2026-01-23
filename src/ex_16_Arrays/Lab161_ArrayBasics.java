package ex_16_Arrays;

public class Lab161_ArrayBasics {
    public static void main(String[] args) {
        int[] marks={90,92,92,93,94,95};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);
        //System.out.println(marks[7]); //.ArrayIndexOutOfBoundsException - Index 7 out of bounds for length 6
        //System.out.println(marks[-1]); //.ArrayIndexOutOfBoundsException - Index -1 out of bounds for length 6

        //second way to create array
        //int[] marks2=new int[5]; //Fixed array
        String[] names= new String[3];
        names[0]="arun";
        names[1]="bhuvan";
        names[2]="charan";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
    }

