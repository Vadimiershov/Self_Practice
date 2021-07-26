package InterviewPractice2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateInMAp {

    public static void main(String[] args) {

        Map<String,String> map = new LinkedHashMap<String, String>();
        map.put("Chase","Chase1");
        map.put("Chase1","Chase1");
        map.put("Chase2","Chase3");

        System.out.println(findDuplicates(map));

    }


    public static String findDuplicates(Map<String, String> map) {

        String result = "";

        for (String name : map.values()) {
            int count = 0;
            for (String name1 : map.values()) {
                if (name.equalsIgnoreCase(name1))
                    count++;
            }
            if (count > 1) {
                result = name;
            }

        }
        return result;

    }
}
