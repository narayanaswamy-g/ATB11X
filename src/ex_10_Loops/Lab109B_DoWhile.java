package ex_10_Loops;

public class Lab109B_DoWhile {
    static void main(String[] args) {

        int i=0;
    //entry controlled loop
        while(i<0){
            System.out.println("print from while" +i);
            i++;
        }
    //exit controlled loop
        do {
            System.out.println("print from DO while: \n" +i);
            i++;
        }while (i<0);
    }
}
