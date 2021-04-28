package InterviewPractice;

public class Fibonacci {

    public static void main(String[] args) {

        int num = 10;

        int a = 0;
        int b = 1;
        int result = 0;

        for (int i = 1; i < num; i++) {
            result = a + b;
            a = b;
            b = result;
            System.out.println(result);
        }




    }

}
