package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,5,6,6,7,7};

        System.out.println(Arrays.toString(arrayWithoutDuplicates(arr)));
        System.out.println(arrayWithoutDuplicates2(arr));
    }

    public static int[] arrayWithoutDuplicates(int[]arr){

        List<Integer> nonDuplList = new ArrayList<>();

        for (int each: arr) {
            if (!nonDuplList.contains(each))
                nonDuplList.add(each);
        }
        int [] nonDupl = new int[nonDuplList.size()];

        for (int i=0;i<nonDuplList.size();i++) {
            nonDupl[i] = nonDuplList.get(i);
        }
        return nonDupl;

    }

    public static TreeSet<Integer> arrayWithoutDuplicates2(int[]arr) {

        TreeSet<Integer>nondupl = new TreeSet<>();
        for (int i=0;i<arr.length;i++){
            nondupl.add(arr[i]);
        }
        return nondupl;

    }
}
