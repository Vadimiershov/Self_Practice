package InterviewPractice;

import java.util.Arrays;

public class AscendingOrder {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 6, 4, 1, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));



    }
}
