import java.util.*;

public class ReversedNumberInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int n = 0;
        int[]num2 = new int[2];
        if(num.length>=2){
            for(int j=0;j<num2.length;j++){
                num2[n]=num[j];
                n++;
            }
            System.out.println(Arrays.toString(num2));
        }
        if(num.length<2){
            System.out.println(Arrays.toString(num));
        }

    }
}