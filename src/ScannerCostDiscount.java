import java.util.Scanner;

public class ScannerCostDiscount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the price: ");
        int costPrice = input.nextInt();
        System.out.println("Please enter quantity: ");
        byte quantity = input.nextByte();

        int costSum = costPrice * quantity;

        if(costSum>5000){
            System.out.println("You got a discount 10%, you final sum is: " + (costSum-(costSum*0.1)));
        }else {
            System.out.println("Your sum is: "+costSum);
        }






    }


}
/*Cost can be calculated as the selling price of the product times the quantity sold, i.e.
Cost price × quantity. Write a program that asks the user to enter product price and quantity and then calculate the Cost.
If the Cost is more than 5000 a discount is 10% offered. Program should display the discount and discounted Cost.
    Ex: 100, 3 -> 300 --> Cost: 300, Discount: 0%
    Ex: 100, 60 -> 6000 -> Cost: 5400, Discount: 10%
*/