package InterviewPractice;

import java.util.*;

public class Practice {

    public static void main(String[] args) {

        String str = "aaasssddddddff";

        String result = "";

        while (!str.isEmpty()){
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(0)==str.charAt(i)){
                    count++;
                }
            }
            result += ""+str.charAt(0)+count;
            str = str.replace(str.charAt(0)+"","");


        }
        System.out.println(result);
    }
}
