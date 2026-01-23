package ex_11_JavaMethods;

public class Lab114_UDF3 {
    static void main(String[] args) {
        int r1= sum(10,20);
        System.out.println(r1);

        int r2 = sum(100,200);
        System.out.println(r2);

        int r3 = sum(1000,2000);
        System.out.println(r3);

        int r4 = sum(10000,20000);
        System.out.println(r4);

        int r5 = sum(100000,200000);
        System.out.println(r5);
    }
    static int sum(int a, int b){
        return a+b;
    }
}
