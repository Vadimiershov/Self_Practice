import java.util.Arrays;
import java.util.Scanner;

public class EmailFromReplit {

    public static void main(String[] args){

        //Scanner scan = new Scanner(System.in);
        String email = "craig_federighi@apple.com";
        int index_ = email.indexOf("_");
        int indexAt = email.indexOf("@");
        String name = email.toUpperCase().charAt(0)+email.substring(1,index_);
        System.out.println(name);
        String lastName = email.toUpperCase().charAt(index_+1)+email.substring(index_+2,indexAt);
        System.out.println(lastName);
        String domain = email.substring(indexAt+1,email.indexOf("."));
        System.out.println(domain);
    }
}
    /*Write a program that will print out information about user based on email. Print first and last name from the upper case.

        Example:
        Input: craig_federighi@apple.com
Output:
        First name: Craig
        Last name: Federighi
        Domain: apple
        Top-Level Domain: com*/