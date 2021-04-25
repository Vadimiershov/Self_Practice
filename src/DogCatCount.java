import java.util.Scanner;

public class DogCatCount {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter you string with cat dogs");
        String catDog = scan.nextLine();
        int dogCount = 0;
        int CatCount = 0;

        for(int i=0;i<=catDog.length()-3;i++) {
            String wordfound = catDog.substring(i,i + 3);

            if (wordfound.equals("cat")) CatCount++;
            if(wordfound.equals("dog")) dogCount++;
        }
        if(dogCount==CatCount)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

    }

}
/*
Print true if the string "cat" and "dog" appear the same number of times in the given string word.
Example:
input: catdog
output: true

Example:
input: catcat
output: false

Example:
input: cat-cheetah-dog-cat
output: false
 */