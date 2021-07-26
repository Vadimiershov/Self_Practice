package InterviewPractice;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countCounterfit {


//    public static void main(String[] args) {
//        String abc = "ABC201910s";
//        System.out.println("firstThreeeEnglish: " + firstThreeEnglish(abc));
//        System.out.println("firstThreeDistinct: " + firstThreeDistinct(abc));
//        System.out.println("year check: " + yearCheck(abc));
//        System.out.println("currency check: " + currencyCheck(abc));
  //      System.out.println(abc.substring(7, 11));


  //  }
//    public static int countCounterfeit(List<String> serialNumber){
//
//        int sum = 0;
//
//
//
//        for (String eachSerial: serialNumber) {
//
//
//
//        }
//
//
//
//    }

    public static boolean serialLength(String serial) {

        if (serial.length() > 9 && serial.length() < 13) {
            return true;
        } else
            return false;

    }


    public static boolean firstThreeEnglish(String serial) {

        String first3 = serial.substring(0, 3);
        String isEnglishUpper = "";

        for (int i = 0; i < first3.length(); i++) {
            if (first3.charAt(i) >= 65 && first3.charAt(i) <= 95) {
                isEnglishUpper += first3.charAt(i);
            }
        }

        if (isEnglishUpper.length() == 3)
            return true;
        else
            return false;

    }

    public static boolean yearCheck(String serial) {

        String year = serial.substring(3, 7);
        int yearInInt = Integer.parseInt(year);
        if (yearInInt >= 1990 && yearInInt <= 2019)
            return true;
        else
            return false;
    }

//    public static boolean firstThreeDistinct(String serial) {
//
//        String first3 = serial.substring(0, 3);
//        for (int i = 0; i < first3.length(); i++) {
//            for (int j = i + 1; j < first3.length(); j++) {
//                if (first3.charAt(i) == first3.charAt(j))
//                    return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean currencyCheck(String serial) {
//
//        for (int i = 7; i < serial.length(); i++) {
//
//            if (Character.isDigit(serial.charAt(i)) && Character.isDigit(serial.charAt(i + 1)) ) {
//                return true;
//            }
//            else if(Character.isDigit(serial.charAt(i+2))){
//                return true;
//            }
//            else if(Character.isDigit(serial.charAt(i+3))){
//                return true;
//            }
//
//        }
//        return false;
//    }
//}
//
//
//    public static int countCounterfeit(List<String> serialNumber) {
//
//        int count = 0;
//        String pattern = "^((19\\d\\d)|(20(0|1)\\d))(10|20|50|100|200|500|1000)[A-Z]$";
//        Pattern r = Pattern.compile(pattern);
//        for(String number:serialNumber){
//            if((number.length()>9 && number.length() < 13)){
//                String afterFirstThree = number.substring(3);
//                Matcher m = r.matcher(afterFirstThree);
//                if(!m.find()){
//                    continue;
//                }
//                if(!firstThreeEnglish(number)){
//                    continue;
//                }
//                if(!firstThreeDistinct(number)){
//                    continue;
//                }
//                if(number.length()==10){
//                    count +=Integer.parseInt(number.substring(7,9));
//                }else if(number.length() == 11){
//                    count +=Integer.parseInt(number.substring(7,10));
//                }else{
//                    count += Integer.parseInt(number.substring(7,11));
//                }
//            }
//
//        }
//        return count;
//    }
//
//
//    public static boolean firstThreeDistinct(String serial){
//
//        String first3 = serial.substring(0,3);
//        for(int i = 0; i < first3.length();i++){
//            for (int j = i+1; j < first3.length(); j++) {
//                if(first3.charAt(i) == first3.charAt(j))
//                    return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean firstThreeEnglish(String serial){
//
//        String first3 = serial.substring (0,3);
//        String isEnglishUpper = "";
//
//        for(int i=0; i < first3.length();i++){
//            if(first3.charAt(i)>=65 && first3.charAt(i)<=95){
//                isEnglishUpper += first3.charAt(i);
//            }
//        }
//        if(isEnglishUpper.length()==3)
//            return true;
//        else
//            return false;
//    }
//


}