package ex_06_TernaryOperator;

public class Lab62_TernaryOperator {
    static void main() {
        //result = condition ? expression1 : expression2;
        int number=10;
        String result = (number<100) ? "YES, number less than 100" : "NO, number not less than 100";
        System.out.println(result);

        result = (number%2==0) ? "YES, number is EVEN" : "NO, number is ODD";
        System.out.println(result);
    }
}
