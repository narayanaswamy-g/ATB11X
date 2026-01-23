package ex_14_Strings;

public class Lab145_CountVowelsAndConsonants {
    static void main(String[] args) {
        String input = "Java Program to Count Vowels and Consonants";
        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();
        System.out.println(input);

        for (int i = 0; i <= input.length()-1; i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels = vowels + 1;
            } else {
                consonants = consonants + 1;
            }
        }
        System.out.println("number of VOWELS: "+vowels);
        System.out.println("number of CONSONANTS: "+consonants);
    }
}
