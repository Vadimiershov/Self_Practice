package InterviewPractice2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacter {

    public static Map frequencyOfCharacter (String str){

        Map<Character,Integer> result = new LinkedHashMap<>();

        for (Character each:str.toCharArray()) {

            if(result.containsKey(each)){
                result.put(each,result.get(each)+1);
            }else
                result.put(each,1);
        }

        return result;

    }

    public static void main (String[]args){

        String str = "aaaaassdffggg";

        System.out.println(frequencyOfCharacter2(str));


    }

    public static String frequencyOfCharacter2(String str){

        String result = "";
        String nonDupl = "";

        for (Character each : str.toCharArray()) {
            if(!nonDupl.contains(each+"")){
                nonDupl += each;
            }
        }

        for (int i = 0; i < nonDupl.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(nonDupl.charAt(i)==str.charAt(j)){
                    count++;
                }

            }
            result+= nonDupl.charAt(i)+""+count;
        }
        return result;
    }



}
