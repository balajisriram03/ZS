import java.util.*;

public class PairSum {

    public static void printPairs(List<Integer> list, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);

            if (map.containsKey(num)) {
                int j = map.get(num);
                System.out.println("(" + list.get(j) + ", " + num + ")");
            }

            map.put(target - num, i);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int target = 6;
        printPairs(list, target);
    }
}
