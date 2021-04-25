package InterviewPractice;

import java.util.*;

public class Find2Frequency {

    public static void main(String[] args) {


        String str = "aaaassssssdddddddffffffff";
        Map<String, Integer> map = new HashMap<>();

        for (String each: str.split("")){
            map.put(each, Collections.frequency(Arrays.asList(str.split("")),each));

        }
        List<Map.Entry<String,Integer>> listofMap = new ArrayList<>(map.entrySet());
        listofMap.sort(Map.Entry.comparingByValue());

        Map<String,Integer> map1 = new LinkedHashMap<>();
        List<Integer> list = new ArrayList<>();

        for(Map.Entry<String,Integer> eachMap : listofMap){
            map1.put(eachMap.getKey(), eachMap.getValue());
            list.add(eachMap.getValue());
        }
        System.out.println(map1);

        System.out.println(list.get(list.size()-2));

    }
}
