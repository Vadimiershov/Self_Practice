package InterviewPractice;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int [] arr = new int[] {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverseArr(arr)));

    }

    public static int [] reverseArr(int [] arr){

        int [] reverseArr = new int[arr.length];
        int counter = 0;

        for (int i = arr.length-1; i >= 0; i--) {
            reverseArr[counter] = arr[i];
            counter++;
        }
        return reverseArr;


    }

}
