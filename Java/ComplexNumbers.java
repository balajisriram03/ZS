public class ComplexNumbers {
    private double real;
    private double imaginary;

    public ComplexNumbers() {
        this.real = 1;
        this.imaginary = 1;
    }

    public ComplexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return this.real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public String toString() {
        if (this.imaginary < 0) {
            return this.real + " " + this.imaginary + "i";
        } else {
            return this.real + " + " + this.imaginary + "i";
        }
    }

    public ComplexNumbers add(ComplexNumbers obj) {
        return new ComplexNumbers(this.real + obj.real, this.imaginary + obj.imaginary);
    }

    public ComplexNumbers subtract(ComplexNumbers obj) {
        return new ComplexNumbers(this.real - obj.real, this.imaginary - obj.imaginary);
    }

    public ComplexNumbers multiply(ComplexNumbers obj) {
        double real = this.real * obj.real - this.imaginary * obj.imaginary;
        double imaginary = this.real * obj.imaginary + this.imaginary * obj.real;
        return new ComplexNumbers(real, imaginary);
    }

    public ComplexNumbers divide(ComplexNumbers obj) {
        double denominator = obj.real * obj.real + obj.imaginary * obj.imaginary;
        double real = (this.real * obj.real + this.imaginary * obj.imaginary) / denominator;
        double imaginary = (this.imaginary * obj.real - this.real * obj.imaginary) / denominator;
        return new ComplexNumbers(real, imaginary);
    }

    public static void main(String[] args) {
        ComplexNumbers obj = new ComplexNumbers(3, 5);
        ComplexNumbers obj2 = new ComplexNumbers(3, 5);
        System.out.println("Sum: " + obj2.add(obj));
        System.out.println("Difference: " + obj2.subtract(obj));
        System.out.println("Product: " + obj2.multiply(obj));
        System.out.println("Division: " + obj2.divide(obj));
    }
}