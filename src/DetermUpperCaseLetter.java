import java.util.Scanner;

public class DetermUpperCaseLetter {

    public static void main (String[]args) {

        System.out.println("Please enter your letter:");

        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        char letter = input;

        Boolean upper = Character.isUpperCase(letter);

        if(upper){
            System.out.println("Your letter "+letter+" is Uppercase");
        }else {
            System.out.println("Your letter "+letter+" is Lowercase");
        }











    }


}
