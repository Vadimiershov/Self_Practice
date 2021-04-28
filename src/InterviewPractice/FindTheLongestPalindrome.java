package InterviewPractice;

import java.util.*;

public class FindTheLongestPalindrome {

    public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna","asdf"));
        System.out.println(longestPalindrome(list));

    }

    public static String longestPalindrome(ArrayList<String> list) {

        String longestPalindrome = "";
        for (String word : list) {

            if (word.length() > longestPalindrome.length()) {
                if (isPalindrome(word)) {
                    longestPalindrome = word;
                }
            }
        }
        return longestPalindrome;
    }

    private static boolean isPalindrome(String word){

        for (int i = 0; i < word.length()/2; i++) {

            if(word.toLowerCase().charAt(i) != word.charAt(word.length()-1-i))
                return false;
        }

        return true;

    }


}
