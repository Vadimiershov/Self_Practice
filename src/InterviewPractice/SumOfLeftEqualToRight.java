package InterviewPractice;

public class SumOfLeftEqualToRight {

    public static void main(String[] args) {

        int arr [] = new int[]{4,9,5,1,3,6,5,4};
        System.out.println(equilibrium(arr));

    }

    public static int equilibrium(int [] arr){

        int result = 0;

        for(int i=1;i<arr.length;i++){

            int sumOfRight = 0;
            int sumOfLeft = 0;

            for (int j = 0; j < i; j++) {
                sumOfLeft += arr[j];
            }

            for (int k = i+1; k < arr.length; k++) {
                sumOfRight += arr[k];
            }

            if(sumOfLeft==sumOfRight)
                result = arr[i];


        }
        return result;
    }

}


