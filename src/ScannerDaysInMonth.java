import java.util.Scanner;

public class ScannerDaysInMonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year = input.nextInt();

        System.out.println("Please enter the month number:");


        byte month = input.nextByte();
        String resultMonth = "";

        switch (month){
            case 1: resultMonth = "January, 31 days";
            break;

            case 2:
            if(year%4==0){
                resultMonth = "February, 29 days";
            }else{
                resultMonth = "February, 28 days";
            }
            break;

            case 3: resultMonth = "March,31 days";
            break;

            case 4: resultMonth = "April, 30 days";
            break;

            case 5: resultMonth = "May, 31 days";
            break;

            case 6: resultMonth = "June, 30 days";
            break;

            case 7: resultMonth = "July, 31 days";
            break;

            case 8: resultMonth = "August, 31 days";
            break;

            case 9: resultMonth = "September, 30 days";
            break;

            case 10: resultMonth = "October, 31 days";
            break;

            case 11: resultMonth = "November, 30 days";
            break;

            case 12: resultMonth = "December, 31 days";
            break;

            default: resultMonth = "Wrong input";


        }

        System.out.println(resultMonth);


    }


}
/*- Recreate the task which tells the user how many days are in a given month (day 13).
Accept a month (number) and year from the console and print how many days are in that specific month.
Handle leap years. Try to redo this ask without looking at the previous code.
*/