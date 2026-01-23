package ex_14_Strings;

public class Lab143_StringBuffer_StringBuilder {
    static void main(String[] args) {
        String s1="naveen";
        String s2=new String("naveen");

        StringBuffer sb1=new StringBuffer("naveen");
        StringBuilder sb2=new StringBuilder("naveen");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(sb1);
        System.out.println(sb2);

        //String Buffer is mutable in nature
        StringBuffer sb3=new StringBuffer("Naveen");
        sb3.append(" Girigowda");
        System.out.println(sb3);
        System.out.println(sb3.reverse());

        //String Builder
        StringBuilder sb4=new StringBuilder("naveen");
        sb4.append(" girigowda");
        System.out.println(sb4);
        System.out.println(sb4.reverse());

    }
}
