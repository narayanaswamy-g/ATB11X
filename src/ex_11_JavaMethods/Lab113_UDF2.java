package ex_11_JavaMethods;

public class Lab113_UDF2 {
    static void main(String[] args) {
        int result1 = return_f1();
        System.out.println(result1);

        boolean result2 =return_f2();
        System.out.println(result2);

        float result3 =return_f3();
        System.out.println(result3);

        double result4 =return_f4();
        System.out.println(result4);

        String result5 =return_f5();
        System.out.println(result5);
    }
    static int return_f1(){
        return 100;
    }
    static boolean return_f2() {
        return true;
    }
    static float return_f3() {
        return 3.14f;
    }
    static double return_f4() {
        return 3.142;
    }
    static String return_f5() {
        return "hi, welcome";
    }
}
