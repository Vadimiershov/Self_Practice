package InterviewPractice;

public class FirstDuplicatedElement {

    public static void main(String[] args) {
String ori = "asdfghhjrr";
        System.out.println(uniqueElement(ori));

    }

    public static String uniqueElement(String origin) {

        String dupl = "";
        for (String each : origin.split("")) {
            int count = 0;
            for (String each2 : origin.split("")) {
                if (each.equals(each2))
                    count++;
            }
            if (count > 1) {
                dupl +=""+each;
                break;
            }
        }
return dupl;
    }

}


