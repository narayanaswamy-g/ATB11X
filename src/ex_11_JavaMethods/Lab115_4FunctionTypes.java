package ex_11_JavaMethods;

public class Lab115_4FunctionTypes {
    static void main(String[] args) {
       f1();

       int result2 = f2();
       System.out.println("returned value from function f2: "+result2);

       f3("naveen1", 30,100000);
       f3("naveen2", 40,200000);

       int result41 = f4(10,20,30); System.out.println(result41);
       int result42 = f4(100,200,300); System.out.println(result42);
    }
    //1.without parameters without return type
    static void f1(){
        System.out.println("printing directly from function f1");
    }
    //2.without parameters with return type
    static int f2(){
        return 100;
    }
    //3.with parameters without return type ***90% USAGE***
    static void f3(String name,int age,double salary){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("salary: "+salary);
    }
    //4.with parameters with return type
    static int f4(int a, int b, int c){
        return a+b+c;
    }
}
