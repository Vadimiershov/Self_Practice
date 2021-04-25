package InterviewPractice;

import java.util.Arrays;

public class ArrayInAscending {

    public static void main(String[] args) {

        int [] arr = new int[] {1,5,2,6,4,2};

        System.out.println(Arrays.toString(sortInAscendingOrder(arr)));



    }

    public static int [] sortInAscendingOrder(int []arr){

        for (int i = 0; i <arr.length; i++) {
            int temp = 0;
            for (int j = 0; j <arr.length; j++) {
                if(arr[j]>arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


}

