import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        String str = "abcdefg";
        String str2 = "GFEDCBA";

        str = str.toLowerCase();
        str2= str2.toLowerCase();

        String[] arr1 = str.split("");
        String[] arr2 = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram  = Arrays.equals(arr1,arr2);

        System.out.println(isAnagram);





    }



}
