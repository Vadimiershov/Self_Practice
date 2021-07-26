package InterviewPractice2;

import java.util.Arrays;

public class SortArray {

    public static int[] sortArray(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            int temp;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]>arr[i]){

                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }


        return arr;
    }

    public static void main(String[] args) {

        int [] arr = new int[]{1,4,5,2,7,3};

        System.out.println(Arrays.toString(sortArray(arr)));

    }

}
