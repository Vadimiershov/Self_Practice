package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSort {

    public static void main(String[] args) {

        List<Integer>list = new ArrayList<>(Arrays.asList(2,6,8,3,5,2));
        List<Integer>list2 = new ArrayList<>(Arrays.asList(2,6,8,3,5,2,7,8,9));
        List<Integer>result = new ArrayList<>();

        //list2.sort(Comparator.reverseOrder());

        for (int i = 0; i < list.size()&& i<list2.size(); i++) {
            result.add(list.get(i));
            result.add(list2.get(i));
        }
        System.out.println(result);



    }


}
