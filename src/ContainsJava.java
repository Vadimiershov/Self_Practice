import java.util.Scanner;

public class ContainsJava {

        public static void main(String[] args) {
            boolean exists = false;
            Scanner scan = new Scanner(System.in);
            String word = scan.next();

            if((word.startsWith("java"))||(word.substring(1).startsWith("java"))){
                exists = true;
            }else{
                exists = false;
            }
            System.out.println(exists);
        }
    }
