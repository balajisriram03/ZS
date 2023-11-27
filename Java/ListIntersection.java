import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListIntersection {

    public static void main(String[] args) {
  
        List<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst1.add(5);

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(3);
        lst2.add(4);
        lst2.add(5);
        lst2.add(6);
        lst2.add(7);

      
        Set<Integer> set1 = new HashSet<>(lst1);

        
        Set<Integer> set2 = new HashSet<>(lst2);

      
        set1.retainAll(set2);

       
        List<Integer> intersection = new ArrayList<>(set1);

     
        System.out.println(intersection);
    }
}
