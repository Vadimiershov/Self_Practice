package InterviewPractice;

public class FirstUniqueElement {

    public static void main(String[] args) {

        int [] array = new int [] {2,2,3,3,4,5,5};
        System.out.println(uniqueElement(array));

    }

    public static int uniqueElement(int[] array) {

        int unique = 0;
        for(int i=0; i<array.length;i++){
            for (int j = 0; j < array.length; j++) {
                if(i!=j)
                    unique=j;
            }
        }
        return unique;
    }
}