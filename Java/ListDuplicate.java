import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDuplicate {

    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(3);
        lst.add(6);
        lst.add(7);

        Set<Integer> s = new HashSet<>();

        for (int num : lst) {
            if (s.contains(num)) {
                System.out.println("Duplicate found: " + num);
                
            } else {
                s.add(num);
            }
        }
    }
}
