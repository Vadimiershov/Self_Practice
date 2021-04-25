package InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosToTheRight {

    public static void main(String[] args) {
    List<Integer>origin = new ArrayList<>(Arrays.asList(1,2,3,4,0,0,5,0,7));
        System.out.println(allZerosToTheRight(origin));
    }

    public static List<Integer> allZerosToTheRight(List<Integer>list1){

        List<Integer> result = new ArrayList<>();

        for (Integer eachNum: list1) {
            if(eachNum !=0)
                result.add(eachNum);
        }

        for (Integer eachZero: list1) {
            if(eachZero==0)
                result.add(eachZero);
        }
        return result;


    }



}
