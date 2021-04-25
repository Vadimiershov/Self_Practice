package InterviewPractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveAhmed {

    public static void main(String[] args) {

        List<String> names = new LinkedList<>(Arrays.asList("Ahmed","Albert","Ahmed"));
        System.out.println(removeAhmed3(names));

    }

    public static List<String> removeAhmed(List<String>names){

        names.removeIf(p -> p.equals("Ahmed"));
        return names;

    }

    public static List<String> removeAhmed2(List<String>names){

        Iterator<String> iter = names.iterator();
        while (iter.hasNext()){
            if(iter.next().equals("Ahmed"))
                iter.remove();

        }
    return names;
    }

    public static List<String> removeAhmed3(List<String>names){

        names.removeAll(Arrays.asList("Ahmed"));
        return names;
    }




}
