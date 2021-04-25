package InterviewPractice;

public class HighestPossibleNumber {

    public static void main(String[] args) {

        System.out.println(HighestPossibleNumber2(-5,5));


    }




    public static String HighestPossibleNumber2(int n1, int n2){
        String str1=String.valueOf(n1);
        char [] charArray=str1.toCharArray();

        String highestPossibleNumber="";

        int i=0;

        while( ((int)Integer.parseInt(charArray[i]+""))>n2){ //87604321,5
            highestPossibleNumber+=charArray[i];
            i++;
        }

        highestPossibleNumber+=n2+"";

        for (int k=i;k<charArray.length;k++){
            highestPossibleNumber+=charArray[k];
        }

        System.out.println("highest Possible Number = " + highestPossibleNumber);
return highestPossibleNumber;
    }
}