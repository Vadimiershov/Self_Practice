import java.util.Scanner;

public class ScannerMultiplyNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter two numbers:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int sum = number1*number2;
        System.out.println(number1 + " * " +number2+" = "+ sum);



    }


}
/*Create a program that will take two int numbers and multiply them. Print in the following way:
    %numOne x %numTwo = %result
    Ex: 3,5 --> 3 x 5 = 15
    Ex: -2,30 --> -2 x 30 = -60
*/