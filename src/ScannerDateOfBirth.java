import java.util.Scanner;

public class ScannerDateOfBirth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your year of birth:");

        int year = input.nextInt();
        if (year > 1900 && year < 2021)
        {
            System.out.println("Please enter your month of birth:");
        }else{
            System.out.println("Wrong year");
        }
            int month = input.nextInt();
            if (month>=1&&month<=12) {
                System.out.println("Please enter your day of birth:");
            } else {
                System.out.println("Wrong month");
            }
            int day = input.nextInt();
            if (day >= 1 && day <= 31) {
                System.out.println("Your date of birth is: " + day + "." + month + "." + year);
            }
        System.out.println("Wrong day");

    }


}
