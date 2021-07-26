package InterviewPractice2;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayRemoveDuplicates {

    public static int [] removeDuplicates(int[]arr){

        ArrayList<Integer> list = new ArrayList<>();

        for (int each: arr) {
            if(!list.contains(each))
                list.add(each);
        }

        int [] arrNoDuplicates = new int[list.size()];

        for (int i=0; i<list.size(); i++) {
            arrNoDuplicates[i] = list.get(i);
        }

        return arrNoDuplicates;

    }

    public static void main(String[] args) {

        int [] arr = new int[] {1,1,2,3,3,4,5,5};

        System.out.println(Arrays.toString(removeDuplicates(arr)));

    }




}
