package ex_05_Type_Casting;

public class Lab59_TypeCasting_narrowing {
    static void main() {
        int x=300;
       // byte y=x; >> impliit casting not allowed implicitly
        System.out.println(x);
        byte y=(byte)x;
        System.out.println(y);
    }
}
