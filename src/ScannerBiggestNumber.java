import java.util.Scanner;

public class ScannerBiggestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter three numbers");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println("Your numbers are:" + num1+","+num2+","+num3);

        boolean max1 = num1>num2 && num1>num3;
        boolean max2 = !max1 && num2>num3;
        boolean max3 = !max1 && !max2;

        if(max1){
            System.out.println(num1+ " is bigger one");
        }else if(max2){
            System.out.println(num2+ " is bigger one");
        }else {
            System.out.println(num3+ " is bigger one");
        }




    }


}
