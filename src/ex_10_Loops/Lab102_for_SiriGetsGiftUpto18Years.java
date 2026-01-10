package ex_10_Loops;

public class Lab102_for_SiriGetsGiftUpto18Years {
    static void main(String[] args) {
        for(int siri=1; siri<18; siri++)
        {
            if (siri == 15) {
                System.out.println("GIFT from papa, IPhone");
            }
            else {
                System.out.println("NO GIFT");
            }

        }
    }
}
