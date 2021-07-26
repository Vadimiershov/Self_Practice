package InterviewPractice2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_findMax {

    public static int[] findMax(int[]arr){

        int [] all0ToTheEnd = new int[arr.length];
        int count = 0;

        for(int i=0; i< arr.length; i++){

            if(arr[i]!=0){
                all0ToTheEnd[count] = arr[i];
                count++;
            }

        }

        return all0ToTheEnd;

    }

    public static void main(String[] args) {

        int [] arr = new int[]{1,0,7,0,5,2,2,8,0};

        System.out.println(Arrays.toString(findMax(arr)));

    }

}
