package ex_02_Java_Basic_Part2;

import org.w3c.dom.ls.LSOutput;

public class Lab15_Variables {
    static void main() {
        byte x = 87; //byte can store upto 127
        System.out.println();
        System.out.println("------------");

        byte age =87;
        String binary = String.format("%8s", Integer.toBinaryString(age & 0xFF))
                .replace(' ', '0');
        System.out.println("Decimal c value: " + age);
        System.out.println("Binary value : " + binary);
    }

}
