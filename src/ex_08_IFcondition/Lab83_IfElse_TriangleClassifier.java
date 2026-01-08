package ex_08_IFcondition;
import java.util.Scanner;

public class Lab83_IfElse_TriangleClassifier {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("type three sides");
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();

        if (s1 == s2 && s2 == s3) {
            System.out.println("EQUILATERAL TRIANGLE");
        } else if (s1 == s2 || s2 == s3 || s1 == s3) {
            System.out.println("ISOSCELES TRIANGLE");
        } else {
            System.out.println("IRREGULAR TRIANGLE");
        }
    }
}
