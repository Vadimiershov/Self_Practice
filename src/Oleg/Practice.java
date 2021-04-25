package Oleg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Practice {

    public static void main(String[] args) {

        int [] arr = {-9,-9,-7,-7,1,8,8,2,2,2,2,2,2,2,75,5,5};
        TreeSet<Integer>nonDupl = new TreeSet<>();
        for (Integer each:
             arr) {
            nonDupl.add(each);
        }
        System.out.println("nonDupl = " + nonDupl);

        int n1 = 9;
        int n2 = 9;

        Integer n3 = 130;
        Integer n4 = 130;

        System.out.println(n4==n3);

    }




}
