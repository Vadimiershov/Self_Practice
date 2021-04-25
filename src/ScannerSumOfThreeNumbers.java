import java.util.Scanner;

public class ScannerSumOfThreeNumbers {

    public static void main(String[] args) {

        System.out.println("Please enter three positive numbers: ");

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1>0 && num2>0 && num3>0){
            System.out.println("Sum positive numbers is: "+ (num1+num2+num3));
        }else{
            System.out.println("Your numbers are not positive!!!");
        }


    }


}
/*Write a program that ask user to enter 3 numbers and shows the sum of the numbers.
 Part 2: Ask the user to enter 3 numbers and calculate the sum of the numbers,
 but only include positive numbers in the total
*/