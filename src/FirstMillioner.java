import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FirstMillioner {

    public static void main(String[] args) {

        System.out.println("Welcome to the Game");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your first question");
        System.out.println("What is the capital of Ukraine?");

        String choise1 = " Kyiv";
        String choise2 = " Barselona";
        String choise3 = " Minsk";
        String choise4 = " Harkiv";

        System.out.println(1 + choise1);
        System.out.println(2 + choise2);
        System.out.println(3 + choise3);
        System.out.println(4 + choise4);

        int answer = scanner.nextInt();
        String result = "";

        if(answer == 1){
            result = "You are win";

        }else if(answer == 2){
            result = "You are lost";
        }else if(answer == 3){
            result = "You are lost";
        }else if(answer == 4){
            result = "You are lost";
        }
        else{
            result = "Wrong input";
        }

        System.out.println(result);



    }

}
