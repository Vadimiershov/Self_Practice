package InterviewPractice;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

        int n = 30;
        System.out.println(consecutive(n));
        System.out.println("1");
        System.out.println("2");

    }

    public static String consecutive(int n){

        String result = "";

        for (int i = 1; i <= n; i++) {
            if(i%2==0 && i%5==0 && i%3==0){
                result+="CodilityTestCoder\n";
            }
            else if(i%2==0 && i%3==0){
                result+="CodilityTest\n";
            }
            else if(i%3==0 && i%5==0){
                result+="CodilityCoders\n";
            }
            else if(i%5==0){
                result+="Coders\n";
            }
            else if(i%3==0){
                result+="Codility\n";
            }
            else if(i%2==0){
                result+="Test\n";
            }
            else {
                result+=i + "\n";
            }
        }
        return result;


    }

}
