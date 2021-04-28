package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WordCountInString {

    public static void main(String[] args) {

        String origin = "java java is is useful";

        ArrayList<String> words = new ArrayList<>(Arrays.asList(origin.split(" ")));

        String result = "";

        for(String word: words){
            if(!result.contains(word)) {
                int frequency = Collections.frequency(words, word);
                result += word +" "+ frequency+"\n";
            }
        }
        System.out.println(result);


    }



}
