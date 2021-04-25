import java.util.Arrays;

public class RuslanCharOperation {


        public static void main(String[] args) {

            //create a string and an empty char array with a larger length
            String str = "cybertek";
            char[] arr = new char[20];
            System.out.println("str = " + str);
            System.out.println("--------");
            System.out.println("arr before = " + Arrays.toString(arr));

            //using getChars() method get any part of the string and past it to any index of the array
            str.getChars(0, 5, arr, 11);
            str.getChars(5, 8, arr, 8);
            System.out.println("arr after = " + Arrays.toString(arr));
            System.out.println("--------");

            //we can use the following code to concat the char elements of the array to another string
            String str2 = "";
            for (char each : arr) str2 += each;
            System.out.println("str2 = " + str2);
        }
    }

