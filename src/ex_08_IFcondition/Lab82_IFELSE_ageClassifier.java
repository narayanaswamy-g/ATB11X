package ex_08_IFcondition;
import java.util.Scanner;

public class Lab82_IFELSE_ageClassifier {
    static void main() {

        Scanner scanner1=new Scanner(System.in);
        System.out.println("ENTER UR AGE");
        int age=scanner1.nextInt();
        System.out.println(age);

        if (age>18){
            System.out.println("ALLOWED TO VOTE");
        }
        else
            System.out.println("NOT-ALLOWED TO VOTE");
    }
}
