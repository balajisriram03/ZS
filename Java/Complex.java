public class Complex{
    double real;
    double imaginary;
    public void set_real(double real)
    {
        this.real=real;
    }
    public double get_real()
    {
        return this.real;
    }
    public void set_imaginary(double imaginary){
        this.imaginary = imaginary;
    }
    public double get_imaginary(){
        return this.imaginary;
    }
    public Complex(){
        this.real = 1;
        this.imaginary = 1;
    }
    
    public Complex(double real,double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex add(Complex obj){
        return new Complex(this.real + obj.real,this.imaginary + obj.imaginary);
    }
    public Complex sub(Complex obj){
        return new Complex(this.real - obj.real,this.imaginary-obj.imaginary);
    }
    public Complex multiply(Complex obj){
        double newReal = (this.real*obj.real) - (this.imaginary*obj.imaginary);
        double newImaginary = (this.real*obj.real)+(this.imaginary*obj.imaginary);
        return new Complex(newReal,newImaginary);
    }
    public Complex divide(Complex obj){
        double newReal = ((this.real*obj.real)+(this.imaginary*obj.imaginary))/
                         ((obj.real*obj.real + obj.imaginary*obj.imaginary));
        double newImaginary = ((this.imaginary*obj.real)-(this.real*obj.imaginary))/
                              ((obj.real*obj.real + obj.imaginary*obj.imaginary));
        return new Complex(newReal,newImaginary);
    }
     public String toString(){
        return this.real + " + i"+this.imaginary;
    }
    public static void main(String[] args) {
        Complex obj1 = new Complex(3, 5);
        Complex obj2 = new Complex(3, 5);
        System.out.println("Num1 = " + obj1);
        System.out.println("Num2 = "+obj2);
        System.out.println("Added = "+ obj2.add(obj1));
        System.out.println("Subtracted = "+obj2.sub(obj1));
        System.out.println("Multiplicated = "+obj2.multiply(obj1));
        System.out.println("Divided = "+obj2.divide(obj1));
    }
}