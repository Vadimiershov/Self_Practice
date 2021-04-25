



import java.util.*;

public class PartyList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the guest name:");
        String guests = input.next();
        System.out.println("Do you have another guest?");
        String answer = input.next();

        while(answer.equals("yes")){
            System.out.println("Please enter the guest name:");
            guests = guests +", "+ input.next();
            System.out.println("Do you have another guest?");
            answer = input.next();
        }
        System.out.println("Guests list: "+guests);

    }
}

