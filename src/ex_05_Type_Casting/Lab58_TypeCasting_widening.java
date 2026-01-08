package ex_05_Type_Casting;

public class Lab58_TypeCasting_widening {
    static void main() {
        byte a=10;
        int b=a;
        //JVM will go to consider it eadily
        byte c=30;
        int d=(int)c;

        System.out.println(b);
        System.out.println(d);

    }
}
