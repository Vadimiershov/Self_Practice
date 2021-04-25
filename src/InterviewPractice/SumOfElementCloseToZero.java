package InterviewPractice;

import java.util.Arrays;

public class SumOfElementCloseToZero {

    public static void main(String[] args) {

        int []arr = new int[]{3,6,7,5,-5};
        System.out.println(Arrays.toString(sum(arr)));

    }

    public static int[]sum (int []arr){

        int []sum = new int[2];
        int exp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                int sumIJ = arr[i] + arr[j];
                if (exp==0)
                    exp = sumIJ;
                if(Math.abs(sumIJ)>0 && Math.abs(sumIJ)< Math.abs(exp)){
                    exp = sumIJ;
                    sum[0] = arr[i];
                    sum[1] = arr[j];
                }
            }

        }
return sum;

    }



}
