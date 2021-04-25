package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDplicates {

    public static void main(String[] args) {

        int []arr = new int[]{1,1,1,2,3,4,5,5,6,6,6,5,3};

        List<Integer>result = new ArrayList<>();

        for (int each: arr) {
            if(!result.contains(each))
                result.add(each);
        }

        System.out.println(result);

        List<Integer>result2 = new ArrayList<>();
        int []arr1 =  Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(arr1));

    }



}
