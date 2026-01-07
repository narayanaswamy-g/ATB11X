package ex_02_Java_Basic_Part2;

public class Lab14_Variables {
    public static void main(String[] args) {
        byte b = 10;
        // byte will store value
        System.out.println("b value is: " + b);

        byte c=11;
        String binary = String.format("%8s", Integer.toBinaryString(c & 0xFF))
                .replace(' ', '0');

        System.out.println("Decimal c value: " + c);
        System.out.println("Binary value : " + binary);
    }
}
