public class NumberCalculation {

    public static void main(String[] args) {

        long num = 14888000;

        String result = "";

        if(num<10){
            result = "1 digit";
        }else if(num<100){
            result = "2 digit";
        }else if(num<1000){
            result = "3 digit";
        }else if(num <10000){
            result = "4 digit";
        }else if(num <100000){
            result = "5 digit";
        }else if(num<1000000){
            result = "6 digit";
        }else {
            result = "invalid number";
        }

        System.out.println(result);

    }


}
