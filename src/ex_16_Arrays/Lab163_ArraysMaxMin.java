package ex_16_Arrays;

public class Lab163_ArraysMaxMin {
    static void main(String[] args) {
        int[] scores={25,14,56,15,36,56,77,18,29,49};

        int max_output=give_me_max(scores);
        System.out.println("maximun of scores is: " +max_output);

        int min_output=give_me_min(scores);
        System.out.println("minimum of scores is: " +min_output);

    }

    private static int give_me_max(int[] scores) {

        int max=scores[0];
        for (int i=0;i<scores.length;i++){
            if(scores[i]>max) max=scores[i];
        }
        return max;
    }

    private static int give_me_min(int[] scores) {
        int min=scores[0];
        for (int i=0;i<scores.length;i++){
            if(scores[i]<min) min=scores[i];
        }
        return min;
    }

}
