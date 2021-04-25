import java.util.Arrays;

public class multiDimensionalArray {

    public static void main(String[] args) {

        int[] arr1D = {1,2,3,4,};
        int[][]arr2D = {{1,2,3,4},{5,6,7,8}};

        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println("===========================================================================");

        for(int[]each1DArray:arr2D){
            System.out.println( Arrays.toString(each1DArray));
        for(int eachElement : each1DArray){
            System.out.println(eachElement);

        }
        }



    }



}
