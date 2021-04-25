import java.util.Scanner;

public class ConvertingNumbers {

    public static void main(String[] args) {

        System.out.println("Enter you number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        String numberValue;

        if(number<=9 && number>=0)
            if(number==0)
                numberValue = "Zero";
            else if(number==1)
                numberValue = "One";
            else if(number==2)
                numberValue = "Two";
            else if(number==3)
                numberValue = "Three";
            else if(number==4)
                numberValue = "Four";
            else if(number==5)
                numberValue = "Five";
            else if(number==6)
                numberValue = "Six";
            else if(number==7)
                numberValue = "Seven";
            else if(number==8)
                numberValue = "Eight";
            else
                numberValue = "Nine";
            else
            numberValue = "Invalid number";
        System.out.println(numberValue);



    }


}
