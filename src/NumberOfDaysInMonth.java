import java.util.Scanner;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        System.out.println("Enter the month number: ");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String daysNumber = "";

        if (month >= 0 && month <= 12) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                daysNumber = "This month has 31 days";
            else if (month == 4 || month == 6 || month == 8 || month == 10)
                daysNumber = "This month has 30 days";

            else
                daysNumber = "This month has 28 days";

             }else
                daysNumber = "Invalid month";
            System.out.println(daysNumber);




    }
}
