package InterviewPractice;

import java.util.Arrays;

public class Merge2Arrays {

    public static void main(String[] args) {

        int [] arr1 = new int[]{1,2,3,4,5};
        int [] arr2 = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(mergeArray(arr1,arr2)));

    }

    public static int [] mergeArray(int[] arr1, int [] arr2){

        int[] finalArray = new int [arr1.length+ arr2.length];
        int index = 0;
        for (int each: arr1) {
            finalArray[index] = each;
            index++;
        }
        for (int each: arr2) {
            finalArray[index] = each;
            index++;
        }
        return finalArray;
    }


}
