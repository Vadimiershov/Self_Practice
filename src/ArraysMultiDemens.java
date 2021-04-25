public class ArraysMultiDemens {

    public static void main(String[] args) {

        String[] word = {"Anna","Level","Lol","Donald","Biden","Aamir","Agalar"};

        int count = 0;

        for(String eachword:word){
            char firstChar = eachword.toLowerCase().charAt(0);
            char lastChar = eachword.toLowerCase().charAt(eachword.length()-1);
            if(firstChar==lastChar)
                count++;
        }
        System.out.println(count);



    }



}
