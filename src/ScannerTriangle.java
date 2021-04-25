import java.util.Scanner;

public class ScannerTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please porvide two angles:");

        double angle1 = input.nextDouble();
        double angle2 = input.nextDouble();

        double sumAngles = angle1 + angle2;

        if(sumAngles>180){
            System.out.println("You provided wrong angels!!!");
        }else{
            System.out.println("Your third angel is: "+ (180-sumAngles));
        }


    }


}
