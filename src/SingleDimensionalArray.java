import java.util.Arrays;

public class SingleDimensionalArray {

    public static void main(String[] args) {

        int[] scores = new int[5];

        scores[0] = 10;
        scores[1] = 11;
        scores[2] = 12;
        scores[3] = 13;
        scores[4] = 14;

        for(int i=0;i<=scores.length-1;i++)
            System.out.println(scores[i]);
        for(int eacharr:scores) {
            System.out.println(eacharr);
        }






    }
}
