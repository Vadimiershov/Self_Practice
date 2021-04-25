import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

    public static void main(String[] args) {
int [] given = new int[]{1,6,3,6,5,6};
 int []finalResult = new int[given.length];
        int count = 0;
 for(int i=0;i<given.length;i++){
     if(given[i]%2==0) {
         finalResult[count] = given[i];
         count++;
     }
 }

        System.out.println(Arrays.toString(finalResult));
 
    }
    }














