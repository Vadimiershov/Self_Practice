package InterviewPractice;

import java.util.*;

public class RemoveIfPalindrome {

    public static void main(String[] args) {

        List<String>list = new ArrayList<>(Arrays.asList("anna","bsd","ollo","aammaa"));
        Iterator<String>it = list.iterator();
        while (it.hasNext()){
            String word = it.next();
            String reversed = "";
            for (int i = word.length()-1;i>=0; i--){
                reversed += word.charAt(i);
            }
            if(!word.equals(reversed))
                it.remove();
        }
//        String longest = "";
//        for (int i = 0; i < list.size(); i++) {
//
//            for (int j = 1+i; j < list.size(); j++) {
//                if(list.get(j).length()>list.get(i).length()){
//                    longest = list.get(j);
//                }
//            }
//        }
        String longest = list.stream().max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(longest);



    }


}
