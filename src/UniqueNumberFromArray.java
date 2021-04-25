import java.util.Scanner;

public class UniqueNumberFromArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int lengthArr = scan.nextInt();
        int [] numbers = new int[lengthArr];
        for (int i = 0; i <=lengthArr-1; i++) {
            System.out.println("Enter your number");
            numbers[i] = scan.nextInt();
        }

        int uniqueNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            int eachNum = numbers[i];
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if(eachNum==numbers[j]){
                    count++;
                }
            }
            if(count==1){
                uniqueNumber += eachNum;
            }
        }

        System.out.println(uniqueNumber);
    }


}
