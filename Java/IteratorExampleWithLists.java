// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;

// public class IteratorExampleWithLists {

//     public static void main(String[] args) {
//         List<String> fruits = new ArrayList<String>();
//         fruits.add("Litchi");
//         fruits.add("Apple");
//         fruits.add("Mango");
//         Iterator<String> itr = fruits.iterator();
        
//         while (itr.hasNext()) {
//             System.out.println(itr.next());
//         }
//     }
// }
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList; 

public class IteratorExampleWithLists {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> fruits = new CopyOnWriteArrayList<String>(); // use CopyOnWriteArrayList instead of ArrayList
        fruits.add("Litchi");
        fruits.add("Apple");
        fruits.add("Mango");
        Iterator<String> itr = fruits.iterator();
        fruits.add("BANANA");
        
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
