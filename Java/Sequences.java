public class Sequences{
    int definiteNumber = 1;
    int a = 1;
    public static void main(String args[]) {
        Sequences arigeo = new Sequences();
        int defNum = 3;
        System.out.println("The value of definite number is "+ defNum);
        System.out.println("Arithmetic Series: " + arigeo.arithmeticSeries());
        System.out.println("Geometric Series: " + arigeo.geometricSeries());
    }
    public String arithmeticSeries() {
        String arithmetic = a + "," + (a + definiteNumber) + "," + (a + 2*definiteNumber) + "," + (a + 3*definiteNumber) + ",...";
        return arithmetic;
    }
    public String geometricSeries() {
        String geometric = a + "," + (a*definiteNumber) + "," + (a*definiteNumber*definiteNumber) + ","+ (a*definiteNumber*definiteNumber*definiteNumber) + ",...";
        return geometric;
    }
}
