import java.util.*;

  public class ListPractice {

      public static void main(String[] args) {

          LinkedList<Integer> num = new LinkedList<>(Arrays.asList(1,2,3,4,5,6)); // list iterator, we can use .set, .add
          ListIterator<Integer> lstIter = num.listIterator();
          System.out.println("lstIter.hasNext() = " + lstIter.hasNext());
          System.out.println("lstIter.next() = " + lstIter.next());
          lstIter.remove();
          while (lstIter.hasNext()) {  // removing item less then 4
              Integer item = lstIter.next();
              if (item <4){
                  lstIter.remove();

              }
          }
          System.out.println(num);




      }

  }

