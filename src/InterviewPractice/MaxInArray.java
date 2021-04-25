package InterviewPractice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class MaxInArray {

    public static void main(String[] args) {
        int [] array = new int[] {1,10,4,4,6,7,7,7,3,5, -8};
        System.out.println(maxArray(array));
        System.out.println(minInArray(array));

    }


    public static int maxArray(int[]array){

    int max = Integer.MIN_VALUE;
    for (int num: array) {
        if(num>max){
            max = num;
        }
    }
    return max;
}

    public static int minInArray(int []arr){

        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }





}