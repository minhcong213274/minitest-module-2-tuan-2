public class Trapezoid {
    private double smallSides, bigSides, height,sides1,sides2;

    public Trapezoid(double smallSides, double bigSides, double height, double sides1, double sides2) {
        this.smallSides = smallSides;
        this.bigSides = bigSides;
        this.height = height;
        this.sides1 = sides1;
        this.sides2 = sides2;
    }

    public  double area(){
        return (smallSides+bigSides)/2*height;
    }
    public double perimeter(){
        return smallSides+bigSides+sides1+sides2;
    }

    public static void main(String[] args) {
        Trapezoid trapezoid = new Trapezoid(20,40,10,15,20);
        Trapezoid trapezoid1 = new Trapezoid(30,50,15,23,46);
        if (trapezoid1.area()>trapezoid.area()){
            System.out.println("trapezoid1 biger");
        }else {
            System.out.println("trapezoid biger");
        }
        if (trapezoid1.perimeter()>trapezoid.perimeter()){
            System.out.println("trapezoid1 biger");
        }else {
            System.out.println("trapezoid biger");
        }
    }

}
