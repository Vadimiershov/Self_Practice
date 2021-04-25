package InterviewPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacterMap {

    public static void main(String[] args) {

        String str = "aaassssdddddffffg";

        Map<Character,Integer> result = new LinkedHashMap<>();

        for (Character each: str.toCharArray()) {

            if(result.containsKey(each)){
                result.put(each,result.get(each)+1);
            }else
                result.put(each,1);

        }
        System.out.println(result);

    }


}
