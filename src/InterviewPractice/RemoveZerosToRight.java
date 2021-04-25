package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveZerosToRight {

    public static void main(String[] args) {


        int[] arrOrigin = new int[]{1, 0, 3, 2, 4, 0, 6};

        int[] arrFinal = new int[arrOrigin.length];
        int count = 0;

        for (int each : arrOrigin) {
            if (each != 0) {
                arrFinal[count] = each;
                count++;
            }
        }
        System.out.println(Arrays.toString(arrFinal));

    }

    public static ArrayList<Integer> ZerosOnTheRight(ArrayList<Integer> originalList){
        ArrayList<Integer> result=new ArrayList<>();

        for (Integer eachInteger : originalList) {
            if(eachInteger!=0){
                result.add(eachInteger);
            }

        }


        for (Integer eachInteger : originalList) {
            if(eachInteger==0){
                result.add(eachInteger);
            }

        }
        return result;
    }

//    public static void main(String[] args) {
//        System.out.println("Result :"+PassWordvalidation(""));
//    }
//    public static boolean PassWordvalidation(String password) {
//        String lowercase="(.*[a-z].*)";
//        String uppercase="(.*[A-Z].*)";
//        String numbers="(.*[0-9].*)";
//        String specialchars="(.*[ -/, :-@].*)";
//        boolean HasLower = password.matches(lowercase),
//                HasUppere = password.matches(uppercase),
//                HasDigits = password.matche


}
