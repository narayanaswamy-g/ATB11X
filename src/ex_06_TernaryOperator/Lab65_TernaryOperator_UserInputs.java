package ex_06_TernaryOperator;

public class Lab65_TernaryOperator_UserInputs {
    static void main(String[] args) {
        //TAKE INPUT FROM USER
        String age1 = args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);

        String result=(age < 18) ? "MINOR" : (age < 65) ? "ADULT": "SENIOR";
        System.out.println(result);
     }
}
