package InterviewPractice2;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveAhmed {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Ahmed", "Ahmed","Anna"));

        removeAhmed3(list);

    }

    public static void removeAhmed(List<String>list){

        Set<String> set = new LinkedHashSet<>();

        for (String each:list) {
            set.add(each);
        }

        System.out.println(set);

    }

    public static void removeAhmed2(List<String>list) {

        list.removeIf(p->p.equals("Ahmed"));

    }

    public static void removeAhmed3(List<String>list) {

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            if(it.next().equals("Ahmed")) {
                it.remove();
            }
        }
        System.out.println(list);


    }

    public static void removeAhmed4(List<String>list) {

        list.removeAll(Arrays.asList("Ahmed"));
    }




    }
