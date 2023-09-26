public class Loops {
    public static void main(String[] args) {
        String name = "Srihari";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'i') {
                count++;
            }
        }
        System.out.println(count);
    }
}