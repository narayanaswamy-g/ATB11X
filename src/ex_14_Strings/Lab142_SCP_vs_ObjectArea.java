package ex_14_Strings;

public class Lab142_SCP_vs_ObjectArea {
    static void main(String[] args) {
        String s1="naveen";
        String s2="naveen";

        String s3=new String("naveen");
        String s4=new String("naveen");

        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1==s4);

    }
    }

