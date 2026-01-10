package ex_08_IFcondition;

public class Lab85_NameAgeSalary_CLIinput {
    static void main(String[] args) {

        System.out.println("please enter ur Name Age Salary");
        String name=args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
