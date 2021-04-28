package InterviewPractice;

public class DivideWithoutDivider {

    public static void main(String[] args) {

        int n = 30;
        int divider = 6;
        int counter = 0;

        while (n>=divider){
            n -= divider;
            counter++;
        }
        System.out.println(counter);


    }


}
