import java.util.Scanner;

public class AgeGroups {

    public static void main(String[] args) {

        System.out.println("Enter your age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String group = "";

        if (age > 0 && age < 150){
            if (age > 55)
                group = "Seniour";
        else if (age >= 21)
            group = "Adult";
        else
            group = "Teenager";
    }else
            group = "Invalid age";
        System.out.println(group);


    }


}
