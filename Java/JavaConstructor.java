public class JavaConstructor {
    int num;

    public JavaConstructor() {
        System.out.println("printing java constructor...");
    }

    public JavaConstructor(int num) {
        this.num = num;
    }

    public JavaConstructor(Integer num) {
        if (num == null) {
            this.num = 0;
        } else {
            this.num = num;
        }
    }

    public JavaConstructor(String num) {
        try {
            this.num = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println("Not a number");
        }
    }

    public void disp() {
        System.out.println(this.num);
    }

    public static void main(String[] args) {
        Integer i1 = null;
        String e2 = null;
        JavaConstructor obj = new JavaConstructor((Integer) null);
        JavaConstructor obj2 = new JavaConstructor(e2);
        obj.disp();
        obj2.disp();
    }
}