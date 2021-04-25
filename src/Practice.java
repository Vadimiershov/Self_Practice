import java.util.Arrays;
import java.util.TreeSet;

public class Practice {

    public static void main(String[] args) {

        String str = "aaadddddsssy";
        String result = "";

        for (String each: str.split("")) {
            int freq= 0;
            for (String each2: str.split("")) {
                if(each.equals(each2))
                    freq++;
            }
            if(freq==1){
                result+=each;
            }
        }
        System.out.println(result);


    }
public static void returnRev(){



}


}
