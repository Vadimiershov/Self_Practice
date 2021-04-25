package InterviewPractice;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String a = "Anna";
        String b = "Anna";

        System.out.println(anagram(a,b));

    }

    public static boolean anagram(String a, String b){

        if(a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        int [] char_frequency = new int[26];

        for (int i = 0; i < a.length(); i++) {
            char current_char = a.charAt(i);
            int index = current_char-'a';
            char_frequency[index]++;
        }

        for (int i = 0; i < b.length(); i++) {
            char current_char = b.charAt(i);
            int index = current_char-'a';
            char_frequency[index]--;
        }

        for (int i = 0; i < 26; i++) {
            if(char_frequency[i]!=0)
                return false;
        }
       return true;
    }

}
